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
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "special_appliances")
public class SpecialAppliances implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sp_key_id",nullable = false)
	private Long spKeyId;

	@NotEmpty
	@Column(name = "appliance_name")
	private String applianceName;
	
	/*@OneToMany(mappedBy="specialAppliances")
	private List<IngredientApplianceMapping> ingreAppMapList;
*/
	
}
