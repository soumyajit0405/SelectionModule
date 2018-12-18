package com.smo.dev.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "chef_detail")
public class ChefDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chef_id",nullable = false)
	private long chefId;

	@NotEmpty
	@Column(name = "full_name")
	private String cheffFullName;

	
	@NotEmpty
	@Column(name = "prim_phone_num")
	private Long primPhoneNum;
	
	@Column(name = "sec_phone_num")
	private Long altPhoneNum;
	
	@NotEmpty
	@Column(name = "aadhaar_num")
	private Long adhaarNum;
	
	@NotEmpty
	@Column(name = "pan_num")
	private String panNum;
	
	@Column(name = "religion")
	private String religion;
	
	@NotEmpty
	@Column(name = "city")
	private String city;
	
	@Column(name = "postal_code")
	private Long postalCode;
	
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
	@Column(name = "travel_charge_per_km")
	private Double perKmTravelCost;
	
	@NotEmpty
	@Column(name = "latitude")
	private Double latitude;
	
	@NotEmpty
	@Column(name = "longitude")
	private Double longitude;
   
    /*@OneToOne(cascade = CascadeType.ALL,
    		fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
	private CheffRatingsAndReview cheffRatingsAndReview;
	*/
    //@OneToMany(fetch = FetchType.LAZY,mappedBy="chefDetail",cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY,mappedBy="chefDetail",cascade = CascadeType.ALL)
    private Set<ChefBookingDetail> chefBookingDetail;
    
    
	@NotEmpty
	@Column(name = "chef_image")
	private File image;
	
	@NotEmpty
	@Column(name = "qualification")
	private String qualification;
	
	@NotEmpty
	@Column(name = "chef_category")
	private String chefCategory;
	
	//private List<String> cusineList;

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

/*	public CheffRatingsAndReview getCheffRatingsAndReview() {
		return cheffRatingsAndReview;
	}

	public void setCheffRatingsAndReview(CheffRatingsAndReview cheffRatingsAndReview) {
		this.cheffRatingsAndReview = cheffRatingsAndReview;
	}
*/
	/* 
    locality character varying(40) COLLATE pg_catalog."default" NOT NULL,
    location point NOT NULL,
	 */
	public ChefDetail() {}

	public long getChefId() {
		return chefId;
	}

	public void setChefId(long chefId) {
		this.chefId = chefId;
	}

	public String getCheffFullName() {
		return cheffFullName;
	}

	public void setCheffFullName(String cheffFullName) {
		this.cheffFullName = cheffFullName;
	}
	
	public Long getPrimPhoneNum() {
		return primPhoneNum;
	}

	public void setPrimPhoneNum(Long primPhoneNum) {
		this.primPhoneNum = primPhoneNum;
	}

	public Long getAltPhoneNum() {
		return altPhoneNum;
	}

	public void setAltPhoneNum(Long altPhoneNum) {
		this.altPhoneNum = altPhoneNum;
	}

	public Long getAdhaarNum() {
		return adhaarNum;
	}

	public void setAdhaarNum(Long adhaarNum) {
		this.adhaarNum = adhaarNum;
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
	
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getChefCategory() {
		return chefCategory;
	}

	public void setChefCategory(String chefCategory) {
		this.chefCategory = chefCategory;
	}

	public Long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
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

	public Double getPerKmTravelCost() {
		return perKmTravelCost;
	}

	public void setPerKmTravelCost(Double perKmTravelCost) {
		this.perKmTravelCost = perKmTravelCost;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Set<ChefBookingDetail> getChefBookingDetail() {
		return chefBookingDetail;
	}

	public void setChefBookingDetail(Set<ChefBookingDetail> chefBookingDetail) {
		this.chefBookingDetail = chefBookingDetail;
	}
	
	
	
}
