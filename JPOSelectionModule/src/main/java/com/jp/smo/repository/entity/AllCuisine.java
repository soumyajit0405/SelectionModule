package com.jp.smo.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;


/**
 * 
 * @author EMazhar
 *
 */
@Data
@Entity
@Table(name = "all_cuisines")
public class AllCuisine implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cuisine_id",nullable = false)
	private Long cuisineId;
	@NotEmpty
	@Column(name = "name")
	private String cusineName;
	@NotEmpty
	@Column(name = "description")
	private String description;
	@OneToMany
	(mappedBy="allCuisine",fetch=FetchType.LAZY)
	private List<DishDetail> dishesList = new ArrayList();
	
	public AllCuisine() {}
		
	
}
