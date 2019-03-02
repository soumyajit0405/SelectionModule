package com.smo.dev.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


public class AllCuisine {
	
	private String cuisineId;
	
	private String cusineName;
	
	private String description;
	
	private List<AllDishes> dishesList;
	
	public AllCuisine() {}
	public String getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(String cuisineId) {
		this.cuisineId = cuisineId;
	}
	public String getCusineName() {
		return cusineName;
	}
	public void setCusineName(String cusineName) {
		this.cusineName = cusineName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<AllDishes> getDishesList() {
		return dishesList;
	}
	public void setDishesList(List<AllDishes> dishesList) {
		this.dishesList = dishesList;
	}
	
	
	
	public AllCuisine(String cuisineId, String cusineName, String description, List<AllDishes> dishesList) {
		
		this.cuisineId = cuisineId;
		this.cusineName = cusineName;
		this.description = description;
		this.dishesList = dishesList;
	}
	
	
}
