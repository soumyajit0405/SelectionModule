package com.smo.dev.model;

import java.io.File;
import java.util.List;

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
	//private List<RatingAndReview> ratingAndReviewList;
	
	public CheffInfoDto () {}
	
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
