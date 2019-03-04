 package com.smo.dev.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*@Entity
@Table(name ="ingredient_appliance_mappings")*/
public class IngredientApplianceMapping implements Serializable  {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "app_mapping_id",nullable = false)
	private int appMappingId;
	
	@ManyToOne
	@JoinColumn(name="ingredient_id")
	private AllIngredients allIngredients;
	
	@ManyToOne
	@JoinColumn(name="key")
	private SpecialAppliances specialAppliances;
	
	public IngredientApplianceMapping() {}
	
	public int getAppMappingId() {
		return appMappingId;
	}
	public void setAppMappingId(int appMappingId) {
		this.appMappingId = appMappingId;
	}
	public AllIngredients getAllIngredients() {
		return allIngredients;
	}
	public void setAllIngredients(AllIngredients allIngredients) {
		this.allIngredients = allIngredients;
	}
	public SpecialAppliances getSpecialAppliances() {
		return specialAppliances;
	}
	public void setSpecialAppliances(SpecialAppliances specialAppliances) {
		this.specialAppliances = specialAppliances;
	}
	
	
*/}
