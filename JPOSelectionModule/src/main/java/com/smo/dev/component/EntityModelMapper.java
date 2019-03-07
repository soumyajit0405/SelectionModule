package com.smo.dev.component;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.smo.dev.model.ChefDetailDto;
import com.smo.dev.model.Location;
import com.smo.dev.model.RatingAndReview;
import com.smo.dev.model.SmoBaseDto;
import com.smo.dev.repository.entity.ChefDetail;
/**
 * 
 * @author Ehtu
 *
 */
@Component
public class EntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public SmoBaseDto mapEntityToDto(ChefDetail chefDetail) {
		Location location = new Location();
		location.setLatitude(chefDetail.getLatitude());
		location.setLongitude(chefDetail.getLongitude());
		SmoBaseDto smoBaseDto = modelMapper.map(chefDetail,SmoBaseDto.class);
		smoBaseDto.setAadhaarNum(0);
		smoBaseDto.setPanNum(null);
		smoBaseDto.setLocation(location);
		return smoBaseDto;
	}
	
	public List<SmoBaseDto> mapEntityListToDtoList(List<ChefDetail> cheffDetailList){
		List<SmoBaseDto> smoBaseDtoList = new ArrayList<>();
		if(!cheffDetailList.isEmpty()) {
			for(ChefDetail chefDetail : cheffDetailList) {
				smoBaseDtoList.add(mapEntityToDto(chefDetail));
			}
		}
		return smoBaseDtoList;
	}
	public List<ChefDetailDto> mapEntityToCheffInfoDto(List<ChefDetail> cheffDetailList ) throws Exception{
		List<ChefDetailDto> cheffInfoList = new ArrayList <>();
		if(!cheffDetailList.isEmpty() && cheffDetailList!=null) {
		for(ChefDetail chefDetail : cheffDetailList) {
			cheffInfoList.add(modelMapper.map(chefDetail, ChefDetailDto.class));
		}
		}
		return cheffInfoList;
	}
	
	
	public void prepareChefProfile(ChefDetail chefDetail) {
		
	}
	
	@Bean
	public ModelMapper gerModelMapper() {
		return new ModelMapper();
	}
}
