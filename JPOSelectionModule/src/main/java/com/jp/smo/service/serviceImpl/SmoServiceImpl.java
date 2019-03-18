package com.jp.smo.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.smo.component.EntityModelMapper;
import com.jp.smo.dto.ChefDetailDTO;
import com.jp.smo.dto.Location;
import com.jp.smo.dto.SmoBaseDto;
import com.jp.smo.exception.ChefNotFoundException;
import com.jp.smo.repository.ChefDishMappingRepository;
import com.jp.smo.repository.SmoRepository;
import com.jp.smo.repository.entity.ChefDetail;
import com.jp.smo.repository.entity.ChefDishMapping;
import com.jp.smo.service.SmoService;

@Service
public class SmoServiceImpl implements SmoService {

	@Autowired
	private SmoRepository smoRepository;
	@Autowired
	private EntityModelMapper entityModelMapper;
	@Autowired
	private ChefDishMappingRepository chefDishMappingRepository;
	
	
	@Override
	public ChefDetailDTO cheffProfileProviderService(long cheffId) throws ChefNotFoundException {
		ChefDetailDTO responseDto = new ChefDetailDTO();
		List<Long> mappinfIdLst = new ArrayList<>();
		try {
			ChefDetail chefDetail = smoRepository.findByChefId(cheffId);
			List<ChefDishMapping> chefDishMappingList = chefDetail.getChefDishMappings();
			for(ChefDishMapping ChefDishMapping : chefDishMappingList) {
				System.out.println("mapping Id : "+ChefDishMapping.getDishMappingId());
				mappinfIdLst.add(ChefDishMapping.getDishMappingId());
			}
				List<ChefDishMapping> DishMapLst = chefDishMappingRepository.findAllById(mappinfIdLst);
				chefDetail.setChefDishMappings(DishMapLst);
			System.out.println("ID :: "+chefDetail.getChefId());
			/*System.out.println("MApping ID :: "+chefDetail.getChefDishMappings().get(0).getDishMappingId());
			System.out.println("Dish ID :: "+chefDetail.getChefDishMappings().get(0).getDishDetail().getDishId());*/
			responseDto = entityModelMapper.prepareChefProfile(chefDetail);
		}catch(Exception e) {
			
		}
		
		return responseDto;
	}

	
}
