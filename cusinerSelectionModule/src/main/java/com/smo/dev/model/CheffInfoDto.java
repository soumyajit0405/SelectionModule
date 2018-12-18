package com.smo.dev.model;

import java.io.File;
import java.util.List;

public class CheffInfoDto {
	private long chef_id;
	private String cheff_name;
	private List<Cusine> cusineList;
	private Location location;
	private File imageFile;
	private int basicTerrif;
	private int averageRating;
	private RatingAndReview ratingAndReview;
	
	public CheffInfoDto() {}
	
	public long getChef_id() {
		return chef_id;
	}
	public void setChef_id(long chef_id) {
		this.chef_id = chef_id;
	}
	public String getCheff_name() {
		return cheff_name;
	}
	public void setCheff_name(String cheff_name) {
		this.cheff_name = cheff_name;
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
	public File getImageFile() {
		return imageFile;
	}
	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}
	public RatingAndReview getRatingAndReview() {
		return ratingAndReview;
	}
	public void setRatingAndReview(RatingAndReview ratingAndReview) {
		this.ratingAndReview = ratingAndReview;
	}

	public int getBasicTerrif() {
		return basicTerrif;
	}

	public void setBasicTerrif(int basicTerrif) {
		this.basicTerrif = basicTerrif;
	}

	public int getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	
	
	
}
