 package com.jp.smo.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name ="ingredient_appliance_mappings")
public class IngredientApplianceMapping implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "app_mapping_id",nullable = false)
	private int appMappingId;
	
	@ManyToOne
	@JoinColumn(name="ingredient_id")
	private IngredientDetail allIngredients;
	
	@ManyToOne
	@JoinColumn(name="sp_app_id")
	private SpecialAppliances specialAppliances;
	
	public IngredientApplianceMapping() {}
	
}
