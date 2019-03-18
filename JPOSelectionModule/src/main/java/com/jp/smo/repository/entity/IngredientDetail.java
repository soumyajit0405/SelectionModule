package com.jp.smo.repository.entity;

import java.io.Serializable;
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
@Data
@Entity
@Table(name = "all_ingredients")
public class IngredientDetail implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingredient_id",nullable = false)
	private Long ingredientId;
	@NotEmpty
	@Column(name = "ingredient_name")
	private String ingredientName;
	@NotEmpty
	@Column(name = "description")
	private String description;
	@NotEmpty
	@Column(name = "average_cost_per_unit")
	private Integer averageCostPerUnit;
	@NotEmpty
	@Column(name = "per_person_amount")
	private Integer perPersonAmount;
	@NotEmpty
	@Column(name = "unit")
	private String unit;
	@NotEmpty
	@Column(name = "needsmicrowaveflag")
	private Boolean needsMicrowaveFlag;
	@NotEmpty
	@Column(name = "needsrefrigeratorflag")
	private Boolean needsRefrigeratorFlag;
	@NotEmpty
	@Column(name = "needsnonstickcookwareflag")
	private Boolean needsNonStickCookwareFlag;
	
	@OneToMany(mappedBy="allIngredients",fetch=FetchType.LAZY)
	private List<DishIngredientMaapping> dishIngredientMaapping;
	/*
	@OneToMany(mappedBy="allIngredients",fetch=FetchType.LAZY)
	private List<IngredientApplianceMapping> ingredientApplianceMapping;
	//manytomany alldishes
*/	
	
	
	public IngredientDetail() {}
		
}