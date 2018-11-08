package com.smo.dev.service;

import java.util.List;

import com.smo.dev.model.SmoBaseDto;

public interface SmoService {
	SmoBaseDto getCheffProfile(Long cheffId);
	List<SmoBaseDto> getCheffListByCuisine(String cuisineType);
	List<SmoBaseDto> getCheffListByLocation(String location);
	List<SmoBaseDto> getAllCheff();
	List<SmoBaseDto> getAvailabeCheffByLocation(String Location,Boolean availabe);
	List<SmoBaseDto> getAvailabeCheffByCuisine (String cuisineType,Boolean available);
}
