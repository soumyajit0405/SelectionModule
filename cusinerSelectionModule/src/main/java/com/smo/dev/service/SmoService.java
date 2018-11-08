package com.smo.dev.service;

import java.util.Set;
import java.util.List;

import com.smo.dev.model.SmoBaseDto;

public interface SmoService {
	SmoBaseDto getCheffProfile(Long cheffId);
	Set<SmoBaseDto> getCheffListByCuisine(List<String> cuisineList);
	List<SmoBaseDto> getCheffListByLocation(String location);
	List<SmoBaseDto> getAllCheff();
	List<SmoBaseDto> getAvailabeCheffByLocation(String Location,Boolean availabe);
	List<SmoBaseDto> getAvailabeCheffByCuisine (String cuisineType,Boolean available);
}
