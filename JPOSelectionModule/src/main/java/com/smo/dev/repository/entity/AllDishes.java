package com.smo.dev.repository.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity        
@Table(name = "all_dishes")
public class AllDishes implements Serializable {
/*dishId
dishName;
description
dishImage;
dishVideo;
cuisineId
type
String type;*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dish_id",updatable = false, unique=true,nullable = false)
	private long dishId;
	
	@NotEmpty
	@Column(name = "dish_name")
	private String dishName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "dish_image")
	private File dishImage;
	
	@Column(name = "dish_video")
	private byte[] dishVideo;
	
	@NotEmpty
	@Column(name = "type")
	private String type;
	//@manyToMany
	//private ChefDetail chefDetail; 
	@ManyToOne
	@JoinColumn(name="cuisine_id")
	private AllCuisine allCuisine;
	
	@OneToMany(mappedBy = "allDishes")
	private List<ChefDishMapping> chefDishMapping;
	
	@OneToMany(mappedBy="allDishes")
	private List<DishIngredientMaapping> dishIngredientMaapping;
	
	public AllDishes() {}
	
	
	
	public AllCuisine getAllCuisine() {
		return allCuisine;
	}



	public void setAllCuisine(AllCuisine allCuisine) {
		this.allCuisine = allCuisine;
	}



	public List<ChefDishMapping> getChefDishMapping() {
		return chefDishMapping;
	}



	public void setChefDishMapping(List<ChefDishMapping> chefDishMapping) {
		this.chefDishMapping = chefDishMapping;
	}



	public List<DishIngredientMaapping> getDishIngredientMaapping() {
		return dishIngredientMaapping;
	}



	public void setDishIngredientMaapping(List<DishIngredientMaapping> dishIngredientMaapping) {
		this.dishIngredientMaapping = dishIngredientMaapping;
	}



	public long getDishId() {
		return dishId;
	}
	public void setDishId(long dishId) {
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
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allCuisine == null) ? 0 : allCuisine.hashCode());
		result = prime * result + ((chefDishMapping == null) ? 0 : chefDishMapping.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (dishId ^ (dishId >>> 32));
		result = prime * result + ((dishImage == null) ? 0 : dishImage.hashCode());
		result = prime * result + ((dishIngredientMaapping == null) ? 0 : dishIngredientMaapping.hashCode());
		result = prime * result + ((dishName == null) ? 0 : dishName.hashCode());
		result = prime * result + Arrays.hashCode(dishVideo);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		AllDishes other = (AllDishes) obj;
		if (allCuisine == null) {
			if (other.allCuisine != null)
				return false;
		} else if (!allCuisine.equals(other.allCuisine))
			return false;
		if (chefDishMapping == null) {
			if (other.chefDishMapping != null)
				return false;
		} else if (!chefDishMapping.equals(other.chefDishMapping))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dishId != other.dishId)
			return false;
		if (dishImage == null) {
			if (other.dishImage != null)
				return false;
		} else if (!dishImage.equals(other.dishImage))
			return false;
		if (dishIngredientMaapping == null) {
			if (other.dishIngredientMaapping != null)
				return false;
		} else if (!dishIngredientMaapping.equals(other.dishIngredientMaapping))
			return false;
		if (dishName == null) {
			if (other.dishName != null)
				return false;
		} else if (!dishName.equals(other.dishName))
			return false;
		if (!Arrays.equals(dishVideo, other.dishVideo))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	}
