package com.smo.dev.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smo.dev.component.DistanceCalculator;
import com.smo.dev.component.EntityModelMapper;
import com.smo.dev.entity.ChefDetail;
import com.smo.dev.model.CheffInfoDto;
import com.smo.dev.model.Location;
import com.smo.dev.model.SmoBaseDto;
import com.smo.dev.repository.SmoBookingRepository;
import com.smo.dev.repository.SmoRepository;
import com.smo.dev.service.SmoService;
/**
 * 
 * @author Ehtu
 *
 */
@Service
public class SmoServiceImpl  implements SmoService{
	
	@Autowired
	private SmoRepository smoRepository;
	
	@Autowired
	private SmoBookingRepository smoBookingRepository;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	/**
	 * @param : it takes a cheff id as a parameter to fetch data agaist db
	 * @return : returns CheffDetail enity need to convert into SmoBaseDto and 
	 * return back to controller
	 */
	@Override
	public SmoBaseDto getCheffProfile(Long cheffId) {
		
		Optional<ChefDetail> optional = smoRepository.findById(cheffId);
		return entityModelMapper.mapEntityToDto(optional.get());
		
	}

	/**
	 * @param : it takes list of cuisine type and based on that It fetch data from DB
	 * @return : returns List of Cheff profile and based on the cusine type
	 * 
	 */
	@Override
	public Set<SmoBaseDto> getCheffListByCuisine(List<String> cuisineList) {
		/*Set<SmoBaseDto> smoBaseDtoSet = new LinkedHashSet<>();
		
		for(String cusine : cuisineList) {
			List<CheffDetail> list = smoRepository.getAllCheffByCusineType(cusine);
			if(!list.isEmpty()) {
				List<SmoBaseDto> smoBaseDtoList = entityModelMapper
						.mapEntityListTODtoList(list);
				for(SmoBaseDto smoBaseDto : smoBaseDtoList) {
					smoBaseDtoSet.add(smoBaseDto);
				}
			}
			
		}
		return smoBaseDtoSet;*/
		return null;
	}

	/**To DO ***/
	@Override
	public List<CheffInfoDto> getCheffListByLocation(Location userLocation,LocalDateTime bookingStartTime,LocalDateTime bookingEndTime) {
		List<ChefDetail> cheffDetailList = smoRepository.getAllChefByBookingTime(bookingStartTime,bookingEndTime);	
		List<CheffInfoDto> chefInfoList = entityModelMapper.mapEntityToCheffInfoDto(cheffDetailList);
		List<CheffInfoDto> chefInfoResultList = new ArrayList<>();
		for(CheffInfoDto CheffInfoDto : chefInfoList) {
			Location chefLocation = CheffInfoDto.getLocation();
			double distance = DistanceCalculator.distanceFinder (userLocation,chefLocation,"Y");
			if(distance <= 4) {
				CheffInfoDto.setDistanceFromCustomer(distance);
				chefInfoResultList.add(CheffInfoDto);
			}
		}
		
		return chefInfoResultList ;
		
	}

	@Override
	public List<SmoBaseDto> getAllCheff() {
		
		return entityModelMapper.mapEntityListToDtoList(smoRepository.findAll());
	}

	@Override
	public List<SmoBaseDto> getAvailabeCheffByLocation(String Location, Boolean availabe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SmoBaseDto> getAvailabeCheffByCuisine(String cuisineType, Boolean available) {
		// TODO Auto-generated method stub
		return null;
	}

}
