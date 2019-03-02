package com.smo.dev.model;

import java.io.File;
import java.util.List;
import java.util.Map;

public class CheffInfoDto {
	
	private long chefId;
	private String cheffFullName;
	//private long phoneNumber;
	private String description;
	private List<Cusine> cusineList;
	private Location location;
	private List<String> bestPreparations;
	private File imageFile;
	private int bookingCost;
	private String chefCategory;
	private int averageRating;
	private Double latitude;
	private Double longitude;
	//private List<RatingAndReview> ratingAndReviewList;
	private Map<String,String> cusineMap;
	public CheffInfoDto () {}
	
	
	public Map<String, String> getCusineMap() {
		return cusineMap;
	}


	public void setCusineMap(Map<String, String> cusineMap) {
		this.cusineMap = cusineMap;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}


	public long getChefId() {
		return chefId;
	}
	public void setChefId(long chefId) {
		this.chefId = chefId;
	}
	public String getCheffFullName() {
		return cheffFullName;
	}
	public void setCheffFullName(String cheffFullName) {
		this.cheffFullName = cheffFullName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Cusine> getCusineList() {
		return cusineList;
	}
	public void setCusineList(List<Cusine> cusineList) {
		this.cusineList = cusineList;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<String> getBestPreparations() {
		return bestPreparations;
	}
	public void setBestPreparations(List<String> bestPreparations) {
		this.bestPreparations = bestPreparations;
	}
	public File getImageFile() {
		return imageFile;
	}
	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}
	public int getBookingCost() {
		return bookingCost;
	}
	public void setBookingCost(int bookingCost) {
		this.bookingCost = bookingCost;
	}
	public String getChefCategory() {
		return chefCategory;
	}
	public void setChefCategory(String chefCategory) {
		this.chefCategory = chefCategory;
	}
	public int getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	
	
}
