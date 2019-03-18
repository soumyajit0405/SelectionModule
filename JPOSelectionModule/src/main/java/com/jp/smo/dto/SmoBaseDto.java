package com.jp.smo.dto;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

public class SmoBaseDto {

	private long chefId;
	private String panNum;
	private long aadhaarNum;
	private String fullName;
	private long primPhoneNum;
	private long altPhoneNum;
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private long postalCode;
	private long areaCode;
	private int prefTravelDistance;
	private int maxTravelDistance;
	private Double perKmTravelCost;
	private String zone;
	private Location location;
	private char chefCategory;
	private List<String> cusineList;
	private LocalDateTime bookingStartTime;
	private LocalDateTime bookingEndTime;
	private File chefImage;
	public SmoBaseDto() {}
	
	
	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public File getChefImage() {
		return chefImage;
	}

	public void setChefImage(File chefImage) {
		this.chefImage = chefImage;
	}

	public long getChefId() {
		return chefId;
	}
	public void setChefId(long chefId) {
		this.chefId = chefId;
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
	
	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public long getAadhaarNum() {
		return aadhaarNum;
	}

	public void setAadhaarNum(long aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}

	public char getChefCategory() {
		return chefCategory;
	}

	public void setChefCategory(char chefCategory) {
		this.chefCategory = chefCategory;
	}

	public List<String> getCusineList() {
		return cusineList;
	}

	public void setCusineList(List<String> cusineList) {
		this.cusineList = cusineList;
	}

	public LocalDateTime getBookingStartTime() {
		return bookingStartTime;
	}

	public void setBookingStartTime(LocalDateTime bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public LocalDateTime getBookingEndTime() {
		return bookingEndTime;
	}

	public void setBookingEndTime(LocalDateTime bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}
	
	
}
