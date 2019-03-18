package com.jp.smo.repository.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.postgresql.geometric.PGpoint;

import com.jp.smo.component.PGPointType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "chef_details")
@TypeDef(name = "type", typeClass = PGPointType.class)
public class ChefDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "chef_id",nullable = false)
	private Long chefId;

	@Column(name = "chef_image")
	private byte[] image;
	
	@NotEmpty
	@Column(name = "full_name")
	private String cheffFullName;
	
	@Column(name = "chef_type")
	private Integer chefType;
	
	
	@Column(name = "chef_category")
	private Integer chefCategory;

			
	@Column(name = "qualification")
	private String qualification;
		
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "comments")
	private String comments;

	/*@Column(name = "availability_flag")
	private short isAvailable;
	*/
	@Column(name = "chef_location")
	@Type(type = "type")
	private PGpoint chefLocation;
	
	
	//private List<String> bestPreparations;
	
	@OneToMany(mappedBy="chefDetail", fetch = FetchType.LAZY)
	private List<ChefDishMapping> chefDishMappings = new ArrayList<>();
	
}
