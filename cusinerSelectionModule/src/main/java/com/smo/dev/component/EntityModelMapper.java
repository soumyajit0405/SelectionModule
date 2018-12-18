package com.smo.dev.component;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.smo.dev.entity.ChefDetail;
import com.smo.dev.model.Location;
import com.smo.dev.model.RatingAndReview;
import com.smo.dev.model.SmoBaseDto;

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
	public List<SmoBaseDto> mapEntityToCheffInfoDto(List<ChefDetail> cheffDetailList,double longitude, double latitude) {
		List<SmoBaseDto> cheffInfoList = new ArrayList<>();
		Location location = new Location();
		RatingAndReview ratingAndReview = new RatingAndReview();		
		SmoBaseDto baseDto = new SmoBaseDto ();
		
		if(!cheffDetailList.isEmpty()) {
			for(ChefDetail chefDetail : cheffDetailList) {
					double diffOflongitude = longitude-chefDetail.getLongitude();
					double diffOflatitude = latitude-chefDetail.getLatitude();
					double range = Math.sqrt((diffOflongitude*diffOflongitude) +  (diffOflatitude*diffOflatitude));
					if(range<=4) {
						baseDto.setChefId(chefDetail.getChefId());
						baseDto.setFullName(chefDetail.getCheffFullName());
						baseDto.setChefImage(chefDetail.getImage());
						location.setLatitude(chefDetail.getLatitude());
						location.setLongitude(chefDetail.getLongitude());
						
						baseDto.setLocation(location);
						/*CheffRatingsAndReview cheffRatingsAndReview = chefDetail.getCheffRatingsAndReview();
						ratingAndReview.setAvgRating(cheffRatingsAndReview.getAvgRatingVal());
						ratingAndReview.setReviewCount(cheffRatingsAndReview.getRatingCount());
						cheffInfoDto.setRatingAndReview(ratingAndReview);*/
					}
					cheffInfoList.add(baseDto);
				}
			
		}
		return cheffInfoList;
	}
	
	
	@Bean
	public ModelMapper gerModelMapper() {
		return new ModelMapper();
	}
}
