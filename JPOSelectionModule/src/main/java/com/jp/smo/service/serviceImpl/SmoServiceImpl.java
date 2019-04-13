package com.jp.smo.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.postgresql.geometric.PGpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.smo.component.DistanceCalculator;
import com.jp.smo.component.EntityModelMapper;
import com.jp.smo.dto.ChefDetailDTO;
import com.jp.smo.dto.Location;
import com.jp.smo.dto.SmoBaseDto;
import com.jp.smo.exception.ChefNotFoundException;
import com.jp.smo.repository.ChefDishMappingRepository;
import com.jp.smo.repository.SmoRepository;
import com.jp.smo.repository.entity.ChefDetail;
import com.jp.smo.repository.entity.ChefDishMapping;
import com.jp.smo.repository.entity.DishDetail;
import com.jp.smo.service.SmoService;
/**
 * 
 * @author EMazhar
 *
 */
@Service
public class SmoServiceImpl implements SmoService {

	@Autowired
	private SmoRepository smoRepository;
	@Autowired
	private EntityModelMapper entityModelMapper;
	@Autowired
	private ChefDishMappingRepository chefDishMappingRepository;
	@Autowired
	private DistanceCalculator distanceCalculator;
	
	
	@Override
	public ChefDetailDTO cheffProfileProviderService(long cheffId) throws ChefNotFoundException {
		ChefDetailDTO responseDto = new ChefDetailDTO();
		List<Long> mappinfIdLst = new ArrayList<>();
		try {
			ChefDetail chefDetail = smoRepository.findByChefId(cheffId);
			List<ChefDishMapping> chefDishMappingList = chefDetail.getChefDishMappings();
			for(ChefDishMapping ChefDishMapping : chefDishMappingList) {
				DishDetail dishDetail = ChefDishMapping.getDishDetail();
				//DishDetail dishDetail1 = chefDishMappingRepository.findOneByDishId(ChefDishMapping.getDishDetail().getDishId());
				mappinfIdLst.add(ChefDishMapping.getDishMappingId());
			}
				//List<ChefDishMapping> DishMapLst = chefDishMappingRepository.findAllById(mappinfIdLst);
				//chefDetail.setChefDishMappings(DishMapLst);
			System.out.println("ID :: "+chefDetail.getChefId());
			/*System.out.println("MApping ID :: "+chefDetail.getChefDishMappings().get(0).getDishMappingId());
			System.out.println("Dish ID :: "+chefDetail.getChefDishMappings().get(0).getDishDetail().getDishId());*/
			responseDto = entityModelMapper.prepareChefProfile(chefDetail);
		}catch(Exception e) {
			
		}

		return responseDto;
	}


	@Override
	public List<ChefDetailDTO> findAvailableChefService(PGpoint currentLocation, LocalDateTime bookingStartTime,
			LocalDateTime bookingEndTime) {
		
		List<ChefDetailDTO> responseDtoList = new ArrayList<>();
		List<ChefDetail> chefDetailList ;
		List<ChefDetail> chefDetailResponseList = new ArrayList<>();
		chefDetailList = smoRepository.findAvailableChefBasedOnBookingTime(bookingStartTime, bookingEndTime);
		
		if(chefDetailList.isEmpty()) {
			chefDetailList = smoRepository.findAll();
		}

		for(ChefDetail chefDetail : chefDetailList) {
			
			if(distanceCalculator.distanceFinder(currentLocation,chefDetail.getChefLocation(), "K")) {
				chefDetailResponseList.add(chefDetail);
			}
		}
		
		System.out.println("Number of records : "+chefDetailResponseList.size());
		for(ChefDetail chefDetail : chefDetailResponseList) {
			System.out.println("name of chef : " +chefDetail.getCheffFullName());
		}
		return responseDtoList;
	}

	
}
