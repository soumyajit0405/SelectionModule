package com.jp.smo.dto;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.postgresql.geometric.PGpoint;

import lombok.Data;
/**
 * 
 * @author Ehtu
 *
 */

@Data
public class ChefDetailDTO {
	
	private long chefId;
	private String cheffFullName;
	//private long phoneNumber;
	private String description;
	private List<CusineDTO> cusineList;
	private Location location;
	private List<String> bestPreparations;
	private byte[] imageFile;
	private int bookingCost;
	private String chefCategory;
	private int averageRating;
	private LocalDateTime bookingStartTime;
	private LocalDateTime bookingEndTime;
	private PGpoint chefLocation;
	//private List<RatingAndReview> ratingAndReviewList;
	List<DishDetailDTO> dishDetailDTOList;
	
	public ChefDetailDTO () {}
	
}

