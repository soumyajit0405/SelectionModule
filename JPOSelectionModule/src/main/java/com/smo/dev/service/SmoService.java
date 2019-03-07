package com.smo.dev.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.smo.dev.model.ChefDetailDto;
import com.smo.dev.model.Location;
import com.smo.dev.model.SmoBaseDto;
/**
 * 
 * @author Ehtu
 *
 */
public interface SmoService {
	ChefDetailDto getCheffProfile(long cheffId);
	Set<SmoBaseDto> getCheffListByCuisine(List<String> cuisineList);
	List<ChefDetailDto> findAvailableChefService(Location location,LocalDateTime bookingStartTime,LocalDateTime bookingEndTime);
	List<SmoBaseDto> getAllCheff();
	List<SmoBaseDto> getAvailabeCheffByLocation(String Location,Boolean availabe);
	List<SmoBaseDto> getAvailabeCheffByCuisine (String cuisineType,Boolean available);
}
