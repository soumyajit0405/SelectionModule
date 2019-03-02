package com.smo.dev.entity;

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
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "chef_extra_detail")
public class ChefExtraDetail  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chef_id",nullable = false)
	private long chefId;
	
	@Column(name = "verification_status")
	private String verificationStatus;

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

	public ChefExtraDetail() {}

	public long getChefId() {
		return chefId;
	}

	public void setChefId(long chefId) {
		this.chefId = chefId;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
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

	public Long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
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

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLineOne == null) ? 0 : addressLineOne.hashCode());
		result = prime * result + ((addressLineTwo == null) ? 0 : addressLineTwo.hashCode());
		result = prime * result + ((adhaarNum == null) ? 0 : adhaarNum.hashCode());
		result = prime * result + ((altPhoneNum == null) ? 0 : altPhoneNum.hashCode());
		result = prime * result + (int) (chefId ^ (chefId >>> 32));
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((maxTravelDistance == null) ? 0 : maxTravelDistance.hashCode());
		result = prime * result + ((panNum == null) ? 0 : panNum.hashCode());
		result = prime * result + ((perKmTravelCost == null) ? 0 : perKmTravelCost.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((prefTravelDistance == null) ? 0 : prefTravelDistance.hashCode());
		result = prime * result + ((primPhoneNum == null) ? 0 : primPhoneNum.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((verificationStatus == null) ? 0 : verificationStatus.hashCode());
		result = prime * result + ((zone == null) ? 0 : zone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChefExtraDetail other = (ChefExtraDetail) obj;
		if (addressLineOne == null) {
			if (other.addressLineOne != null)
				return false;
		} else if (!addressLineOne.equals(other.addressLineOne))
			return false;
		if (addressLineTwo == null) {
			if (other.addressLineTwo != null)
				return false;
		} else if (!addressLineTwo.equals(other.addressLineTwo))
			return false;
		if (adhaarNum == null) {
			if (other.adhaarNum != null)
				return false;
		} else if (!adhaarNum.equals(other.adhaarNum))
			return false;
		if (altPhoneNum == null) {
			if (other.altPhoneNum != null)
				return false;
		} else if (!altPhoneNum.equals(other.altPhoneNum))
			return false;
		if (chefId != other.chefId)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (maxTravelDistance == null) {
			if (other.maxTravelDistance != null)
				return false;
		} else if (!maxTravelDistance.equals(other.maxTravelDistance))
			return false;
		if (panNum == null) {
			if (other.panNum != null)
				return false;
		} else if (!panNum.equals(other.panNum))
			return false;
		if (perKmTravelCost == null) {
			if (other.perKmTravelCost != null)
				return false;
		} else if (!perKmTravelCost.equals(other.perKmTravelCost))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (prefTravelDistance == null) {
			if (other.prefTravelDistance != null)
				return false;
		} else if (!prefTravelDistance.equals(other.prefTravelDistance))
			return false;
		if (primPhoneNum == null) {
			if (other.primPhoneNum != null)
				return false;
		} else if (!primPhoneNum.equals(other.primPhoneNum))
			return false;
		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		if (verificationStatus == null) {
			if (other.verificationStatus != null)
				return false;
		} else if (!verificationStatus.equals(other.verificationStatus))
			return false;
		if (zone == null) {
			if (other.zone != null)
				return false;
		} else if (!zone.equals(other.zone))
			return false;
		return true;
	}
	
	
}
