package com.smo.dev.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smo.dev.model.CheffInfoDto;
import com.smo.dev.model.Location;
import com.smo.dev.model.SmoBaseDto;
import com.smo.dev.service.SmoService;

@RestController

public class SmoController {
	
	@Autowired
	private SmoService smoService;
	
	//@Value( "${chff.range}" )
	private int range=4;
	
	@GetMapping(value="/health")
	public ResponseEntity<String> getHealthCheck (){
		
		return new ResponseEntity<String>(new String("Yes I am good"),HttpStatus.OK);
	}
	
	/*
	 * @requet : chef Id to fetch the profile 
	 * @response : chef profile  
	 */
	@GetMapping(value="/profile/{chefId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheffInfoDto> getCheffProfile(@PathVariable int chefId) {
		CheffInfoDto cheffInfoDto = smoService.getCheffProfile(chefId);
		if(cheffInfoDto!= null) {
			return new ResponseEntity<CheffInfoDto>(cheffInfoDto,HttpStatus.FOUND);
		}
			return new ResponseEntity<CheffInfoDto>(cheffInfoDto,HttpStatus.NOT_FOUND);
	}
	
	/**
	 * 
	 * @param smoBaseDto
	 * @return This service serves the search result based on the location and 
	 *         availablity of the chef
	 */
	@PostMapping(value="/allProfile",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CheffInfoDto>> getAllAvailableCheffList(SmoBaseDto smoBaseDto) {
		Location location = smoBaseDto.getLocation();
		//calling services
		List<CheffInfoDto> smoDtoList = smoService.findAvailableChefService(location,
				smoBaseDto.getBookingStartTime(),smoBaseDto.getBookingEndTime());
		
		if(!smoDtoList.isEmpty()) {
			return new ResponseEntity<List<CheffInfoDto>>(smoDtoList,HttpStatus.FOUND);
		}
			return new ResponseEntity<List<CheffInfoDto>>(smoDtoList,HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping(value="/cheffByCsn")
	public ResponseEntity<Set<SmoBaseDto>> getAllCheffListByCuisine(@RequestBody SmoBaseDto smoBaseDto ) {
		Set<SmoBaseDto> smoBaseDtoList = smoService.getCheffListByCuisine(smoBaseDto.getCusineList());
		if(!smoBaseDtoList.isEmpty()) {
			return new ResponseEntity<Set<SmoBaseDto>>(smoBaseDtoList,HttpStatus.FOUND);
		}
			return new ResponseEntity<Set<SmoBaseDto>>(smoBaseDtoList,HttpStatus.NOT_FOUND);
	}
	
	//LocalDateTime bookingStartTime,@RequestParam LocalDateTime bookingEndTime) 
			//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
			//LocalDateTime startDateTime = LocalDateTime.parse(smoBaseDto.getBookingStartTime(), formatter);
}
