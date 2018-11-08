package com.smo.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.smo.dev.model.SmoBaseDto;
import com.smo.dev.service.SmoService;

@RestController("/smo")
public class SmoController {
	
	@Autowired
	private SmoService smoService;
	
	@GetMapping(value="/profile")
	public ResponseEntity<SmoBaseDto> getCheffProfile(@RequestBody Long cheffId) {
		SmoBaseDto smoBaseDto = smoService.getCheffProfile(cheffId);
		if(smoBaseDto!= null) {
			return new ResponseEntity<SmoBaseDto>(smoBaseDto,HttpStatus.FOUND);
		}
			return new ResponseEntity<SmoBaseDto>(smoBaseDto,HttpStatus.NOT_FOUND);
	}
		
	@GetMapping(value="/allProfile")
	public ResponseEntity<List<SmoBaseDto>> getAllCheffList() {
		List<SmoBaseDto> smoBaseDtoList = smoService.getAllCheff();
		if(!smoBaseDtoList.isEmpty()) {
			return new ResponseEntity<List<SmoBaseDto>>(smoBaseDtoList,HttpStatus.FOUND);
		}
			return new ResponseEntity<List<SmoBaseDto>>(smoBaseDtoList,HttpStatus.NOT_FOUND);
	}
		
	
	
	
}
