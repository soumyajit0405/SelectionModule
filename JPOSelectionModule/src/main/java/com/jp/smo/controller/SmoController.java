package com.jp.smo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jp.smo.dto.ChefDetailDTO;
import com.jp.smo.dto.Location;
import com.jp.smo.dto.SmoBaseDto;
import com.jp.smo.repository.ChefDishMappingRepository;
import com.jp.smo.service.SmoService;

@RestController
@CrossOrigin()
public class SmoController {
	
	@Autowired
	private SmoService smoService;
	
	@Autowired
	private ChefDishMappingRepository chefDishMappingRepository;
	
	//@Value( "${chff.range}" )
	private int range=4;
	
	@GetMapping(value="/health")
	public ResponseEntity<String> getHealthCheck (){
		
		return new ResponseEntity<String>(new String("Yes I AM SELECTION MODULE,UP AND RUNNING"),HttpStatus.OK);
	}
	
	/*
	 * @requet : chef Id to fetch the profile 
	 * @response : chef profile  
	 */
	@GetMapping(value="/profile/{chefId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ChefDetailDTO> getCheffProfile(@PathVariable long chefId) {
		
		ChefDetailDTO cheffInfoDto = smoService.cheffProfileProviderService (chefId);
		if(cheffInfoDto!= null) {
			return new ResponseEntity<ChefDetailDTO>(cheffInfoDto,HttpStatus.FOUND);
		}
			return new ResponseEntity<ChefDetailDTO>(cheffInfoDto,HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param smoBaseDto
	 * @return This service serves the search result based on the location and 
	 *         availablity of the chef
	 */
	/*@PostMapping(value="/allProfile",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChefDetailDTO>> getAllAvailableCheffList(ChefDetailDTO chefDetailDto) {
		Location location = chefDetailDto.getLocation();
		//calling services
		List<ChefDetailDTO> smoDtoList = smoService.findAvailableChefService(location,
				chefDetailDto.getBookingStartTime(),chefDetailDto.getBookingEndTime());
		
		if(!smoDtoList.isEmpty()) {
			return new ResponseEntity<List<ChefDetailDTO>>(smoDtoList,HttpStatus.FOUND);
		}
			return new ResponseEntity<List<ChefDetailDTO>>(smoDtoList,HttpStatus.OK);
	}*/
	
	
	/*@GetMapping(value="/cheffByCsn")
	public ResponseEntity<Set<SmoBaseDto>> getAllCheffListByCuisine(@RequestBody SmoBaseDto smoBaseDto ) {
		Set<SmoBaseDto> smoBaseDtoList = smoService.getCheffListByCuisine(smoBaseDto.getCusineList());
		if(!smoBaseDtoList.isEmpty()) {
			return new ResponseEntity<Set<SmoBaseDto>>(smoBaseDtoList,HttpStatus.FOUND);
		}
			return new ResponseEntity<Set<SmoBaseDto>>(smoBaseDtoList,HttpStatus.OK);
	}
	*/
	//LocalDateTime bookingStartTime,@RequestParam LocalDateTime bookingEndTime) 
			//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
			//LocalDateTime startDateTime = LocalDateTime.parse(smoBaseDto.getBookingStartTime(), formatter);
}