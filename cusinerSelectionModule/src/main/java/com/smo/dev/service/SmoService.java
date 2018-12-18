package com.smo.dev.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.smo.dev.model.Location;
import com.smo.dev.model.SmoBaseDto;

public interface SmoService {
	SmoBaseDto getCheffProfile(Long cheffId);
	Set<SmoBaseDto> getCheffListByCuisine(List<String> cuisineList);
	List<SmoBaseDto> getCheffListByLocation(Location location,LocalDateTime bookingStartTime,LocalDateTime bookingEndTime);
	List<SmoBaseDto> getAllCheff();
	List<SmoBaseDto> getAvailabeCheffByLocation(String Location,Boolean availabe);
	List<SmoBaseDto> getAvailabeCheffByCuisine (String cuisineType,Boolean available);
}
