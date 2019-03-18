package com.jp.smo.repository.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "chef_dish_mappings")
@NoArgsConstructor
public class ChefDishMapping implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dish_mapping_id",nullable = false)
	private Long dishMappingId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dish_id",nullable = false,insertable = false, updatable = false)
	private DishDetail dishDetail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chef_id",nullable = false,insertable = false, updatable = false)
	private ChefDetail chefDetail;
	
	@Column(name = "preparation_score")
	private Integer preparationScore;

}
