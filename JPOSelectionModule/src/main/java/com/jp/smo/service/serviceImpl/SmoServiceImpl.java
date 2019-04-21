package com.jp.smo.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.postgresql.geometric.PGpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.smo.component.DistanceCalculator;
import com.jp.smo.component.EntityModelMapper;
import com.jp.smo.dto.CategoryTariffDto;
import com.jp.smo.dto.ChefDetailDTO;
import com.jp.smo.dto.Location;
import com.jp.smo.dto.SmoBaseDto;
import com.jp.smo.exception.ChefNotFoundException;
import com.jp.smo.repository.ChefDishMappingRepository;
import com.jp.smo.repository.SmoRepository;
import com.jp.smo.repository.entity.CategoryTariff;
import com.jp.smo.repository.entity.ChefBookingDetail;
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

	private Map<Integer,Double> cateogryPriceMap = new HashMap<Integer,Double>();
	private Map<Integer,String> ChefTypeMap = new HashMap <>();
	@Autowired
	private SmoRepository smoRepository;
	@Autowired
	private EntityModelMapper entityModelMapper;
	@Autowired
	private ChefDishMappingRepository chefDishMappingRepository;
	@Autowired
	private DistanceCalculator distanceCalculator;
	@Autowired
	private SmoPicklistServiceImpl smoPicklistServiceImpl;
	
	
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
			e.printStackTrace();
		}

		return responseDto;
	}


	@Override
	@Transactional
	public Set<ChefDetailDTO> findAvailableChefService(PGpoint currentLocation, LocalDateTime bookingStartTime,
			LocalDateTime bookingEndTime) {	
		Map<Integer,CategoryTariffDto> categoryTariffMap = smoPicklistServiceImpl.getCategoryTariffMap();
		Set<ChefDetailDTO> responseDtoSet = new HashSet<>();
		Set<ChefDetail> chefAvailableSet ;
		ChefDetailDTO responseDto = new ChefDetailDTO();
		chefAvailableSet = smoRepository.findAvailableChefBasedOnBookingTime(bookingStartTime, bookingEndTime);
		System.out.println("Size of chefAvailable List :"+chefAvailableSet.size());
		   
		for(ChefDetail chefDetail : chefAvailableSet) {
			System.out.println("test : "+chefDetail.getChefId());
			PGpoint chefCurrentLocation ;
			PGpoint chefBaseLocation = chefDetail.getChefLocation();
			if( chefDetail.getBookingDetail().size()>=1) {
				System.out.println("test1 : "+chefDetail.getChefId());
				for(ChefBookingDetail bkd: chefDetail.getBookingDetail()) {
					if((bookingStartTime.compareTo(bkd.getEndTime().plusMinutes(30))<0)) {//chef booking end time +30 min >= new Booking start time
						
						chefBaseLocation = bkd.getPgPoint();
					}
				
				if(distanceCalculator.distanceFinder(currentLocation,chefBaseLocation, "K")) {
					responseDto =entityModelMapper.mapEntityToDto(chefDetail);
					responseDto.setCategoryTariffDto(categoryTariffMap.get(chefDetail.getChefCategory()));
					responseDtoSet.add(responseDto);
				}
			}
		}else if (chefDetail.getBookingDetail().size()==0) {
			System.out.println("Test2 :"+chefDetail.getChefId());
			if(distanceCalculator.distanceFinder(currentLocation,chefBaseLocation, "K")) {
				responseDto =entityModelMapper.mapEntityToDto(chefDetail);
				responseDto.setCategoryTariffDto(categoryTariffMap.get(chefDetail.getChefCategory()));
				
				responseDtoSet.add(responseDto);
				}
		}
	}
		return responseDtoSet;
	} 
}
