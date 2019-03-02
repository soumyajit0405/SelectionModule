package com.smo.dev.entity;

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

@Entity
@Table(name = "special_appliances")
public class SpecialAppliances {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "key",nullable = false)
	private int key;

	@NotEmpty
	@Column(name = "appliance_name")
	private String applianceName;
	
	@OneToMany(mappedBy="specialAppliances")
	private List<IngredientApplianceMapping> ingreAppMapList;

	public SpecialAppliances() {}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public List<IngredientApplianceMapping> getIngreAppMapList() {
		return ingreAppMapList;
	}

	public void setIngreAppMapList(List<IngredientApplianceMapping> ingreAppMapList) {
		this.ingreAppMapList = ingreAppMapList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applianceName == null) ? 0 : applianceName.hashCode());
		result = prime * result + ((ingreAppMapList == null) ? 0 : ingreAppMapList.hashCode());
		result = prime * result + key;
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
		SpecialAppliances other = (SpecialAppliances) obj;
		if (applianceName == null) {
			if (other.applianceName != null)
				return false;
		} else if (!applianceName.equals(other.applianceName))
			return false;
		if (ingreAppMapList == null) {
			if (other.ingreAppMapList != null)
				return false;
		} else if (!ingreAppMapList.equals(other.ingreAppMapList))
			return false;
		if (key != other.key)
			return false;
		return true;
	}

	
	
}
