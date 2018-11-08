package com.smo.dev.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smo.dev.component.EntityModelMapper;
import com.smo.dev.entity.CheffDetail;
import com.smo.dev.model.SmoBaseDto;
import com.smo.dev.repository.SmoRepository;
import com.smo.dev.service.SmoService;

@Service
public class SmoServiceImpl  implements SmoService{
	
	@Autowired
	private SmoRepository smoRepository;
	
	@Autowired
	private EntityModelMapper entityModelMapper;
	
	/**
	 * @param : it takes a cheff id as a parameter to fetch data agaist db
	 * @return : returns CheffDetail enity need to convert into SmoBaseDto and 
	 * return back to controller
	 */
	@Override
	public SmoBaseDto getCheffProfile(Long cheffId) {
		
		Optional<CheffDetail> optional = smoRepository.findById(cheffId);
		return entityModelMapper.mapEntityToDto(optional.get());
		
	}

	@Override
	public List<SmoBaseDto> getCheffListByCuisine(String cuisineType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SmoBaseDto> getCheffListByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SmoBaseDto> getAllCheff() {
		
		return entityModelMapper.mapEntityListTODtoList(smoRepository.findAll());
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
