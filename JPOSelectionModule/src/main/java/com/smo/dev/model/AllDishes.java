package com.smo.dev.model;

import java.io.File;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

public class AllDishes {
/*dishId
dishName;
description
dishImage;
dishVideo;
cuisineId
type
String type;*/
	
	private int dishId;
	
	private String dishName;
	
	private String description;
	
	private File dishImage;
	
	private byte[] dishVideo;
	
	private int cuisineId;
	
	private String type;
	//@manyToMany
	//private ChefDetail chefDetail;
	
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public File getDishImage() {
		return dishImage;
	}
	public void setDishImage(File dishImage) {
		this.dishImage = dishImage;
	}
	public byte[] getDishVideo() {
		return dishVideo;
	}
	public void setDishVideo(byte[] dishVideo) {
		this.dishVideo = dishVideo;
	}
	public int getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
