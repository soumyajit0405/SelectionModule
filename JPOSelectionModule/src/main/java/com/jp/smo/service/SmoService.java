package com.jp.smo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.postgresql.geometric.PGpoint;

import com.jp.smo.dto.ChefDetailDTO;
import com.jp.smo.dto.Location;
import com.jp.smo.dto.SmoBaseDto;
import com.jp.smo.exception.ChefNotFoundException;
/**
 * 
 * @author Ehtu
 *
 */
public interface SmoService {
	
	/*
	 * 
	 */
	ChefDetailDTO cheffProfileProviderService (long cheffId)  throws ChefNotFoundException;
	/*
	*//**
	 * 
	 * @param cuisineList
	 * @return
	 *//*
	Set<SmoBaseDto> getCheffListByCuisine(List<String> cuisineList);
	*/
	/**
	 * 
	 * @param location
	 * @param bookingStartTime
	 * @param bookingEndTime
	 * @return
	 */
	List<ChefDetailDTO> findAvailableChefService(PGpoint currentLocation,LocalDateTime bookingStartTime,LocalDateTime bookingEndTime);
	
	
	//List<SmoBaseDto> getAvailabeCheffByLocation(String Location,Boolean availabe);
	
}
