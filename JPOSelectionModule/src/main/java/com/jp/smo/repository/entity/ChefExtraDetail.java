package com.jp.smo.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "chef_extra_details")
public class ChefExtraDetail  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chef_id",nullable = false)
	private Long chefId;
	
	@Column(name = "verification_status")
	private Integer verificationStatus;
	
	@Column(name = "alt_phn_number")
	private Long altPhoneNum;
	
	@NotEmpty
	@Column(name = "aadhar_number")
	private Long aadharNumber;
	
	@NotEmpty
	@Column(name = "pan")
	private String panNum;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "locality")
	private String locality;
	
	@NotEmpty
	@Column(name = "city")
	private String city;
	
	/*@Column(name = "postal_code")
	private Long postalCode;*/
	
	@NotEmpty
	@Column(name = "pref_travel_distance")
	private Integer prefTravelDistance;
	
	@NotEmpty
	@Column(name = "max_travel_distance")
	private Integer maxTravelDistance;
	
	@NotEmpty
	@Column(name = "zone")
	private String zone;
	
	@Column(name = "address_line_one")
	private String addressLineOne;
	
	@Column(name = "address_line_two")
	private String addressLineTwo;
	
	@NotEmpty
	@Column(name = "per_km_travel_cost")
	private Double perKmTravelCost;
	
}
