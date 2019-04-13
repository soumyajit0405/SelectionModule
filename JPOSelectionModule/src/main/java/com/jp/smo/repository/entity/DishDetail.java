package com.jp.smo.repository.entity;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity        
@Table(name = "all_dishes")
@NoArgsConstructor
public class DishDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dish_id",updatable = false, unique=true,nullable = false)
	private Long dishId;
	
	
	@Column(name = "dish_name")
	private String dishName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "dish_image")
	private File dishImage;
	
	@Column(name = "dish_video")
	private byte[] dishVideo;
	
	@NotEmpty
	@Column(name = "dish_type")
	private String type;
	 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cuisine_id")
	private AllCuisine allCuisine;
	
	@OneToMany(mappedBy = "dishDetail",fetch = FetchType.LAZY)
	private List<ChefDishMapping> chefDishMapping = new ArrayList<>();
	
	@OneToMany(mappedBy="allDishes")
	private List<DishIngredientMaapping> dishIngredientMaapping = new ArrayList<>();

	@Override
	public String toString() {
		return "DishDetail [dishId=" + dishId + ", dishName=" + dishName + ", description=" + description
				+ ", dishImage=" + dishImage + ", dishVideo=" + Arrays.toString(dishVideo) + ", type=" + type + "]";
	}

	
	}
