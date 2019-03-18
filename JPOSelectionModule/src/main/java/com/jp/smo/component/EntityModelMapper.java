package com.jp.smo.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.jp.smo.dto.ChefDetailDTO;
import com.jp.smo.dto.DishDetailDTO;
import com.jp.smo.dto.Location;
import com.jp.smo.dto.RatingAndReview;
import com.jp.smo.dto.SmoBaseDto;
import com.jp.smo.repository.entity.AllCuisine;
import com.jp.smo.repository.entity.ChefDetail;
import com.jp.smo.repository.entity.ChefDishMapping;
import com.jp.smo.repository.entity.DishDetail;
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
	public List<ChefDetailDTO> mapEntityToCheffInfoDto(List<ChefDetail> cheffDetailList ) throws Exception{
		List<ChefDetailDTO> cheffInfoList = new ArrayList <>();
		if(!cheffDetailList.isEmpty() && cheffDetailList!=null) {
		for(ChefDetail chefDetail : cheffDetailList) {
			cheffInfoList.add(modelMapper.map(chefDetail, ChefDetailDTO.class));
		}
		}
		
		return cheffInfoList;
	}
	
	
	public ChefDetailDTO prepareChefProfile(ChefDetail chefDetail) {
		
		ChefDetailDTO responseDto = new ChefDetailDTO();
		responseDto = modelMapper.map(chefDetail, ChefDetailDTO.class);
		List<DishDetailDTO> dishDetailDTOList = new ArrayList<>();
		List<ChefDishMapping> chefDishMappingList = chefDetail.getChefDishMappings();
		System.out.println("chefDishMappingList size : "+chefDishMappingList.size());
		if(!chefDishMappingList.isEmpty() || chefDishMappingList!=null) {
			
			for(ChefDishMapping chefDishMapping : chefDishMappingList) {
				DishDetail dishDetail= chefDishMapping.getDishDetail();
				if(dishDetail!=null) {
					System.out.println("DISH NAME: "+dishDetail.getDishName());
					dishDetailDTOList.add(modelMapper.map(dishDetail, DishDetailDTO.class));
				}
				
			}
			responseDto.setDishDetailDTOList(dishDetailDTOList);
		}
		
		return responseDto;
	}
	
	@Bean
	public ModelMapper gerModelMapper() {
		return new ModelMapper();
	}
}
