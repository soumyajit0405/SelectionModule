package com.smo.dev.entity;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cheff_detail")
public class CheffDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cheff_id", nullable = false)
	private Long cheffId;

	@NotEmpty
	@Column(name = "cheff_full_name", nullable = false)
	private String cheffFullName;
	
	@Column(name = "AGE", nullable = false)
	private Integer age;
	
	@NotEmpty
	@Column(name = "prim_phone_num", nullable = false)
	private Long phoneNum;
	
	@Column(name = "sec_phone_num", nullable = false)
	private Long altPhoneNum;
	
	@NotEmpty
	@Column(name = "aadhar_num", nullable = false)
	private Long addhaarNum;
	
	@NotEmpty
	@Column(name = "pan_num", nullable = false)
	private String panNum;
	
	@Column(name = "religion", nullable = false)
	private String religion;
	
	@NotEmpty
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "postal_code", nullable = false)
	private Long postalCode;
	
	@Column(name = "area_code", nullable = false)
	private Long areaCode;
	
	@NotEmpty
	@Column(name = "pref_travel_distance", nullable = false)
	private Integer prefTravelDistance;
	
	@NotEmpty
	@Column(name = "max_travel_distance", nullable = false)
	private Integer maxTravelDistance;
	
	@NotEmpty
	@Column(name = "zone", nullable = false)
	private String zone;
	
	@Column(name = "address_line_one")
	private String addressLineOne;
	
	@Column(name = "address_line_two")
	private String addressLineTwo;
	
	@NotEmpty
	@Column(name = "travel_charge_per_km", nullable = false)
	private Double travelChargePerKm;
	
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private Double altitude;
	
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private Double longitutde;
	
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private File image;
	
	
	/* 
    locality character varying(40) COLLATE pg_catalog."default" NOT NULL,
    location point NOT NULL,
	 */
	public CheffDetail() {}

	public Long getCheffId() {
		return cheffId;
	}

	public void setCheffId(Long cheffId) {
		this.cheffId = cheffId;
	}

	public String getCheffFullName() {
		return cheffFullName;
	}

	public void setCheffFullName(String cheffFullName) {
		this.cheffFullName = cheffFullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Long getAltPhoneNum() {
		return altPhoneNum;
	}

	public void setAltPhoneNum(Long altPhoneNum) {
		this.altPhoneNum = altPhoneNum;
	}

	public Long getAddhaarNum() {
		return addhaarNum;
	}

	public void setAddhaarNum(Long addhaarNum) {
		this.addhaarNum = addhaarNum;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPrefTravelDistance() {
		return prefTravelDistance;
	}

	public void setPrefTravelDistance(Integer prefTravelDistance) {
		this.prefTravelDistance = prefTravelDistance;
	}

	public Integer getMaxTravelDistance() {
		return maxTravelDistance;
	}

	public void setMaxTravelDistance(Integer maxTravelDistance) {
		this.maxTravelDistance = maxTravelDistance;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Double getLongitutde() {
		return longitutde;
	}

	public void setLongitutde(Double longitutde) {
		this.longitutde = longitutde;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public Long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
	}

	public Long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public Double getTravelChargePerKm() {
		return travelChargePerKm;
	}

	public void setTravelChargePerKm(Double travelChargePerKm) {
		this.travelChargePerKm = travelChargePerKm;
	}
	
	
	
}
