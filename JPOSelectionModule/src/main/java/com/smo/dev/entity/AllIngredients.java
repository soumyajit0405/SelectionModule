package com.smo.dev.entity;

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
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "all_ingredients")
public class AllIngredients implements Serializable  {
	/*ingredientId
	ingredientName
	description
	average_cost_per_unit*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingredient_id",nullable = false)
	private int ingredient_id;
	@NotEmpty
	@Column(name = "ingredient_name")
	private String ingredientName;
	@NotEmpty
	@Column(name = "description")
	private String description;
	@NotEmpty
	@Column(name = "average_cost_per_unit")
	private int averageCostPerUnit;
	@NotEmpty
	@Column(name = "number_cost_per_unit")
	private int numberCostPerUnit;
	@NotEmpty
	@Column(name = "unit")
	private String unit;
	@NotEmpty
	@Column(name = "needs_microwave_flag")
	private boolean needsMicrowaveFlag;
	@NotEmpty
	@Column(name = "needs_refrigerator_flag")
	private boolean needsRefrigeratorFlag;
	@NotEmpty
	@Column(name = "needs_non_stick_cookware_flag")
	private boolean needsNonStickCookwareFlag;
	
	@OneToMany(mappedBy="allIngredients")
	private List<DishIngredientMaapping> dishIngredientMaapping;
	
	@OneToMany(mappedBy="allIngredients")
	private List<IngredientApplianceMapping> ingreAppMappingList;
	//manytomany alldishes
	
	public AllIngredients() {}
	
	public int getIngredient_id() {
		return ingredient_id;
	}
	public void setIngredient_id(int ingredient_id) {
		this.ingredient_id = ingredient_id;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getAverageCostPerUnit() {
		return averageCostPerUnit;
	}
	public void setAverageCostPerUnit(int averageCostPerUnit) {
		this.averageCostPerUnit = averageCostPerUnit;
	}
	public boolean isNeedsMicrowaveFlag() {
		return needsMicrowaveFlag;
	}
	public void setNeedsMicrowaveFlag(boolean needsMicrowaveFlag) {
		this.needsMicrowaveFlag = needsMicrowaveFlag;
	}
	public boolean isNeedsRefrigeratorFlag() {
		return needsRefrigeratorFlag;
	}
	public void setNeedsRefrigeratorFlag(boolean needsRefrigeratorFlag) {
		this.needsRefrigeratorFlag = needsRefrigeratorFlag;
	}
	public int getNumberCostPerUnit() {
		return numberCostPerUnit;
	}
	public void setNumberCostPerUnit(int numberCostPerUnit) {
		this.numberCostPerUnit = numberCostPerUnit;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public boolean isNeedsNonStickCookwareFlag() {
		return needsNonStickCookwareFlag;
	}
	public void setNeedsNonStickCookwareFlag(boolean needsNonStickCookwareFlag) {
		this.needsNonStickCookwareFlag = needsNonStickCookwareFlag;
	}

	public List<DishIngredientMaapping> getDishIngredientMaapping() {
		return dishIngredientMaapping;
	}

	public void setDishIngredientMaapping(List<DishIngredientMaapping> dishIngredientMaapping) {
		this.dishIngredientMaapping = dishIngredientMaapping;
	}

	public List<IngredientApplianceMapping> getIngreAppMappingList() {
		return ingreAppMappingList;
	}

	public void setIngreAppMappingList(List<IngredientApplianceMapping> ingreAppMappingList) {
		this.ingreAppMappingList = ingreAppMappingList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + averageCostPerUnit;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((dishIngredientMaapping == null) ? 0 : dishIngredientMaapping.hashCode());
		result = prime * result + ((ingreAppMappingList == null) ? 0 : ingreAppMappingList.hashCode());
		result = prime * result + ((ingredientName == null) ? 0 : ingredientName.hashCode());
		result = prime * result + ingredient_id;
		result = prime * result + (needsMicrowaveFlag ? 1231 : 1237);
		result = prime * result + (needsNonStickCookwareFlag ? 1231 : 1237);
		result = prime * result + (needsRefrigeratorFlag ? 1231 : 1237);
		result = prime * result + numberCostPerUnit;
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
		AllIngredients other = (AllIngredients) obj;
		if (averageCostPerUnit != other.averageCostPerUnit)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dishIngredientMaapping == null) {
			if (other.dishIngredientMaapping != null)
				return false;
		} else if (!dishIngredientMaapping.equals(other.dishIngredientMaapping))
			return false;
		if (ingreAppMappingList == null) {
			if (other.ingreAppMappingList != null)
				return false;
		} else if (!ingreAppMappingList.equals(other.ingreAppMappingList))
			return false;
		if (ingredientName == null) {
			if (other.ingredientName != null)
				return false;
		} else if (!ingredientName.equals(other.ingredientName))
			return false;
		if (ingredient_id != other.ingredient_id)
			return false;
		if (needsMicrowaveFlag != other.needsMicrowaveFlag)
			return false;
		if (needsNonStickCookwareFlag != other.needsNonStickCookwareFlag)
			return false;
		if (needsRefrigeratorFlag != other.needsRefrigeratorFlag)
			return false;
		if (numberCostPerUnit != other.numberCostPerUnit)
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		return true;
	}
	
	
	
}