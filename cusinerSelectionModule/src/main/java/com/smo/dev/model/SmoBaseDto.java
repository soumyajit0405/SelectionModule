package com.smo.dev.model;

import java.util.List;

public class SmoBaseDto {

	private int cheffId;
	private String fullName;
	private long primPhoneNum;
	private long altPhoneNum;
	private long adhaarNum;
	private String panNum;
	private String addressLineOne;
	private String addressLineTwo;
	private String religion;
	private String city;
	private long postalCode;
	private long areaCode;
	private int prefTravelDistance;
	private int maxTravelDistance;
	private Double perKmTravelCost;
	private String zone;
	private Double longitutde;
	private Double latitutde;
	private List<String> cusineList;
	
	public SmoBaseDto() {}
	
	public int getCheffId() {
		return cheffId;
	}
	public void setCheffId(int cheffId) {
		this.cheffId = cheffId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getPrimPhoneNum() {
		return primPhoneNum;
	}
	public void setPrimPhoneNum(long primPhoneNum) {
		this.primPhoneNum = primPhoneNum;
	}
	public long getAltPhoneNum() {
		return altPhoneNum;
	}
	public void setAltPhoneNum(long altPhoneNum) {
		this.altPhoneNum = altPhoneNum;
	}
	public long getAdhaarNum() {
		return adhaarNum;
	}
	public void setAdhaarNum(long adhaarNum) {
		this.adhaarNum = adhaarNum;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
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
	public long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}
	public long getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(long areaCode) {
		this.areaCode = areaCode;
	}
	public int getPrefTravelDistance() {
		return prefTravelDistance;
	}
	public void setPrefTravelDistance(int prefTravelDistance) {
		this.prefTravelDistance = prefTravelDistance;
	}
	public int getMaxTravelDistance() {
		return maxTravelDistance;
	}
	public void setMaxTravelDistance(int maxTravelDistance) {
		this.maxTravelDistance = maxTravelDistance;
	}
	public Double getPerKmTravelCost() {
		return perKmTravelCost;
	}
	public void setPerKmTravelCost(Double perKmTravelCost) {
		this.perKmTravelCost = perKmTravelCost;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Double getLongitutde() {
		return longitutde;
	}
	public void setLongitutde(Double longitutde) {
		this.longitutde = longitutde;
	}
	public Double getLatitutde() {
		return latitutde;
	}
	public void setLatitutde(Double latitutde) {
		this.latitutde = latitutde;
	}

	public List<String> getCusineList() {
		return cusineList;
	}

	public void setCusineList(List<String> cusineList) {
		this.cusineList = cusineList;
	}
	
	
}
