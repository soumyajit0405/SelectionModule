package com.smo.dev.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "all_cuisines")
public class AllCuisine implements Serializable {
/*cuisineId;
cusineName;
description;
*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cuisine_id",nullable = false)
	private long cuisineId;
	@NotEmpty
	@Column(name = "cusine_name")
	private String cusineName;
	@NotEmpty
	@Column(name = "description")
	private String description;
	//onetomany
	@OneToMany
	(mappedBy="allCuisine",fetch=FetchType.LAZY)
	private List<AllDishes> dishesList = new ArrayList();
	
	public AllCuisine() {}
	
	
	
	public long getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(long cuisineId) {
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cuisineId ^ (cuisineId >>> 32));
		result = prime * result + ((cusineName == null) ? 0 : cusineName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((dishesList == null) ? 0 : dishesList.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllCuisine other = (AllCuisine) obj;
		if (cuisineId != other.cuisineId)
			return false;
		if (cusineName == null) {
			if (other.cusineName != null)
				return false;
		} else if (!cusineName.equals(other.cusineName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dishesList == null) {
			if (other.dishesList != null)
				return false;
		} else if (!dishesList.equals(other.dishesList))
			return false;
		return true;
	}



	public AllCuisine(long cuisineId, @NotEmpty String cusineName, @NotEmpty String description,
			List<AllDishes> dishesList) {
		
		this.cuisineId = cuisineId;
		this.cusineName = cusineName;
		this.description = description;
		this.dishesList = dishesList;
	}
	
	
	
}
