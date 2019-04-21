package com.jp.smo.dto;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.postgresql.geometric.PGpoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Ehtu
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChefDetailDTO {
	
	private long chefId;
	private String chefFullName;
	//private long phoneNumber;
	private String description;
	private List<CusineDTO> cusineList;
	private Location location;
	private List<String> bestPreparations;
	private byte[] imageFile;
	private double bookingCost;
	private String chefCategory;
	private int averageRating;
	private LocalDateTime bookingStartTime;
	private LocalDateTime bookingEndTime;
	private PGpoint chefLocation;
	//private List<RatingAndReview> ratingAndReviewList;
	List<DishDetailDTO> dishDetailDTOList;
	private CategoryTariffDto categoryTariffDto;
	
}

