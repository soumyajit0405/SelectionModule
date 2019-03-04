package com.smo.dev.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smo.dev.component.DistanceCalculator;
import com.smo.dev.component.EntityModelMapper;
import com.smo.dev.model.CheffInfoDto;
import com.smo.dev.model.Location;
import com.smo.dev.model.SmoBaseDto;
import com.smo.dev.repository.SmoBookingRepository;
import com.smo.dev.repository.SmoRepository;
import com.smo.dev.repository.entity.ChefDetail;
import com.smo.dev.repository.entity.ChefExtraDetail;
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
	
	@Autowired
	private ModelMapper modelMapper;
	
	/**
	 * @param : it takes a cheff id as a parameter to fetch data agaist db
	 * @return : returns CheffDetail enity need to convert into SmoBaseDto and 
	 * return back to controller
	 */
	@Override
	@Transactional
	public CheffInfoDto getCheffProfile(int cheffId) {
		CheffInfoDto cheffInfoDto = new CheffInfoDto();
		try {
			ChefDetail chefDetail = smoRepository.getOne(cheffId);
		if(chefDetail!=null) {
			return modelMapper.map(chefDetail,CheffInfoDto.class);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cheffInfoDto;
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
	public List<CheffInfoDto> findAvailableChefService
	(Location userLocation,LocalDateTime bookingStartTime,LocalDateTime bookingEndTime) {
		
		List<CheffInfoDto> chefInfoResultList = new ArrayList<>();
		try {
			List<ChefDetail>	cheffDetailList = smoRepository.getAllChefByBookingTime(bookingStartTime,bookingEndTime);	
		List<CheffInfoDto> chefInfoList = entityModelMapper.mapEntityToCheffInfoDto(cheffDetailList);
		
		
		
		for(CheffInfoDto CheffInfoDto : chefInfoList) {
			Location chefLocation = CheffInfoDto.getLocation();
			double distance = DistanceCalculator.distanceFinder (userLocation,chefLocation,"Y");
			if(distance <= 4) {
				//CheffInfoDto.setDistanceFromCustomer(distance);
				chefInfoResultList.add(CheffInfoDto);
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
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
