package com.jp.smo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data	
public class AllCuisineDTO {
	
	private String cuisineId;
	
	private String cusineName;
	
	private String description;
	
	private List<DishDetailDTO> dishesList;
	
	public AllCuisineDTO() {}
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
	public List<DishDetailDTO> getDishesList() {
		return dishesList;
	}
	public void setDishesList(List<DishDetailDTO> dishesList) {
		this.dishesList = dishesList;
	}
	
	
	
	public AllCuisineDTO(String cuisineId, String cusineName, String description, List<DishDetailDTO> dishesList) {
		
		this.cuisineId = cuisineId;
		this.cusineName = cusineName;
		this.description = description;
		this.dishesList = dishesList;
	}
	
	
}
