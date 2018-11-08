package com.smo.dev.component;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smo.dev.entity.CheffDetail;
import com.smo.dev.model.SmoBaseDto;

@Component
public class EntityModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public SmoBaseDto mapEntityToDto(CheffDetail cheffDetail) {
		return modelMapper.map(cheffDetail,SmoBaseDto.class);
	}
	
	public List<SmoBaseDto> mapEntityListTODtoList(List<CheffDetail> cheffDetailList){
		List<SmoBaseDto> smoBaseDtoList = new ArrayList<>();
		if(!cheffDetailList.isEmpty()) {
			for(CheffDetail cheffDetail : cheffDetailList) {
				smoBaseDtoList.add(mapEntityToDto(cheffDetail));
			}
		}
		return smoBaseDtoList;
	}
}
