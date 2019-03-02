package com.smo.dev.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.smo.dev.model.CheffInfoDto;
import com.smo.dev.model.Location;
import com.smo.dev.model.SmoBaseDto;
/**
 * 
 * @author Ehtu
 *
 */
public interface SmoService {
	CheffInfoDto getCheffProfile(int cheffId);
	Set<SmoBaseDto> getCheffListByCuisine(List<String> cuisineList);
	List<CheffInfoDto> findAvailableChefService(Location location,LocalDateTime bookingStartTime,LocalDateTime bookingEndTime);
	List<SmoBaseDto> getAllCheff();
	List<SmoBaseDto> getAvailabeCheffByLocation(String Location,Boolean availabe);
	List<SmoBaseDto> getAvailabeCheffByCuisine (String cuisineType,Boolean available);
}
