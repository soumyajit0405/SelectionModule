package com.smo.dev.repository.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chef_dish_mappings")
public class ChefDishMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dish_mapping_id",nullable = false)
	private Long dishMappingId;
	
	@ManyToOne
	@JoinColumn(name = "dish_id")
	private AllDishes allDishes;
	
	@ManyToOne
	@JoinColumn(name = "chef_id")
	private ChefDetail chefDetail;
	
	@Column(name = "preparation_score")
	private int preparationScore;

	public ChefDishMapping() {}
	
	public Long getDishMappingId() {
		return dishMappingId;
	}

	public void setDishMappingId(Long dishMappingId) {
		this.dishMappingId = dishMappingId;
	}

	public AllDishes getAllDishes() {
		return allDishes;
	}

	public void setAllDishes(AllDishes allDishes) {
		this.allDishes = allDishes;
	}

	public ChefDetail getChefDetail() {
		return chefDetail;
	}

	public void setChefDetail(ChefDetail chefDetail) {
		this.chefDetail = chefDetail;
	}

	public int getPreparationScore() {
		return preparationScore;
	}

	public void setPreparationScore(int preparationScore) {
		this.preparationScore = preparationScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allDishes == null) ? 0 : allDishes.hashCode());
		result = prime * result + ((chefDetail == null) ? 0 : chefDetail.hashCode());
		result = prime * result + ((dishMappingId == null) ? 0 : dishMappingId.hashCode());
		result = prime * result + preparationScore;
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
		ChefDishMapping other = (ChefDishMapping) obj;
		if (allDishes == null) {
			if (other.allDishes != null)
				return false;
		} else if (!allDishes.equals(other.allDishes))
			return false;
		if (chefDetail == null) {
			if (other.chefDetail != null)
				return false;
		} else if (!chefDetail.equals(other.chefDetail))
			return false;
		if (dishMappingId == null) {
			if (other.dishMappingId != null)
				return false;
		} else if (!dishMappingId.equals(other.dishMappingId))
			return false;
		if (preparationScore != other.preparationScore)
			return false;
		return true;
	}

	public ChefDishMapping(Long dishMappingId, AllDishes allDishes, ChefDetail chefDetail, int preparationScore) {
		this.dishMappingId = dishMappingId;
		this.allDishes = allDishes;
		this.chefDetail = chefDetail;
		this.preparationScore = preparationScore;
	}
	
	
	
}
