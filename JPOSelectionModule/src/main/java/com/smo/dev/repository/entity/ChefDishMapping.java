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
	private int dishMappingId;
	
	@ManyToOne
	@JoinColumn(name = "dish_id")
	private AllDishes allDishes;
	
	@ManyToOne
	@JoinColumn(name = "chef_id")
	private ChefDetail chefDetail;
	
	private int preparationScore;
	
	
}
