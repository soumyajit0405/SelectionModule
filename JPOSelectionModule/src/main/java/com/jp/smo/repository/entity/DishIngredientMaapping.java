package com.jp.smo.repository.entity;

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

import lombok.Data;

@Data
@Entity
@Table(name="dish_ingredient_mappings")
public class DishIngredientMaapping implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingredient_mapping_id",nullable = false)
	private Long ingredientMappingId;
	
	@ManyToOne
	@JoinColumn(name ="ingredient_id")
	private IngredientDetail allIngredients;
	
	@ManyToOne
	@JoinColumn(name ="dish_id")
	private DishDetail allDishes;
	
	 public DishIngredientMaapping() {}
	 
}
