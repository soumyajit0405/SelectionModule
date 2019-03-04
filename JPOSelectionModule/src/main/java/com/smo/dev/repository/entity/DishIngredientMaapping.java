package com.smo.dev.repository.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dish_ingredient_mapping")
public class DishIngredientMaapping implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingredient_mapping_id",nullable = false)
	private long ingredientMappingId;
	
	@ManyToOne
	@JoinColumn(name ="ingredient_id")
	private AllIngredients allIngredients;
	
	@ManyToOne
	@JoinColumn(name ="dish_id")
	private AllDishes allDishes;
	 public DishIngredientMaapping() {}
	 
	public long getIngredientMappingId() {
		return ingredientMappingId;
	}
	public void setIngredientMappingId(long ingredientMappingId) {
		this.ingredientMappingId = ingredientMappingId;
	}
	public AllIngredients getAllIngredients() {
		return allIngredients;
	}
	public void setAllIngredients(AllIngredients allIngredients) {
		this.allIngredients = allIngredients;
	}
	public AllDishes getAllDishes() {
		return allDishes;
	}
	public void setAllDishes(AllDishes allDishes) {
		this.allDishes = allDishes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allDishes == null) ? 0 : allDishes.hashCode());
		result = prime * result + ((allIngredients == null) ? 0 : allIngredients.hashCode());
		result = prime * result + (int) (ingredientMappingId ^ (ingredientMappingId >>> 32));
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
		DishIngredientMaapping other = (DishIngredientMaapping) obj;
		if (allDishes == null) {
			if (other.allDishes != null)
				return false;
		} else if (!allDishes.equals(other.allDishes))
			return false;
		if (allIngredients == null) {
			if (other.allIngredients != null)
				return false;
		} else if (!allIngredients.equals(other.allIngredients))
			return false;
		if (ingredientMappingId != other.ingredientMappingId)
			return false;
		return true;
	}
	 
}
