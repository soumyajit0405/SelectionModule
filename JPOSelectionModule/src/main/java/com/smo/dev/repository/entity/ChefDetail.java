package com.smo.dev.repository.entity;

import java.io.File;
import java.io.Serializable;
import java.util.List;
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
public class ChefDetail extends ChefExtraDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Column(name = "chef_image")
	private File image;
	
	@NotEmpty
	@Column(name = "full_name")
	private String cheffFullName;
	
	@Column(name = "chef_type")
	private String chefType;
	
	@NotEmpty
	@Column(name = "chef_category")
	private String chefCategory;

	@NotEmpty
	@Column(name = "qualification")
	private String qualification;
		
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "comments")
	private String comments;

	@Column(name = "isAvailable")
	private boolean isAvailable;
	
	@NotEmpty
	@Column(name = "latitude")
	private Double latitude;
	
	@NotEmpty
	@Column(name = "longitude")
	private Double longitude;
	
	//private List<String> bestPreparations;
	@OneToMany(mappedBy="chefDetail",fetch = FetchType.LAZY)
	private List<ChefBookingDetail> chefBookingDetail;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="chefDetail", fetch = FetchType.LAZY)
	private List<ChefDishMapping> chefDishMappings;

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getCheffFullName() {
		return cheffFullName;
	}

	public void setCheffFullName(String cheffFullName) {
		this.cheffFullName = cheffFullName;
	}

	public String getChefType() {
		return chefType;
	}

	public void setChefType(String chefType) {
		this.chefType = chefType;
	}

	public String getChefCategory() {
		return chefCategory;
	}

	public void setChefCategory(String chefCategory) {
		this.chefCategory = chefCategory;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	/*public List<String> getBestPreparations() {
		return bestPreparations;
	}

	public void setBestPreparations(List<String> bestPreparations) {
		this.bestPreparations = bestPreparations;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		//result = prime * result + ((bestPreparations == null) ? 0 : bestPreparations.hashCode());
		result = prime * result + ((chefCategory == null) ? 0 : chefCategory.hashCode());
		result = prime * result + ((chefType == null) ? 0 : chefType.hashCode());
		result = prime * result + ((cheffFullName == null) ? 0 : cheffFullName.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChefDetail other = (ChefDetail) obj;
	/*	if (bestPreparations == null) {
			if (other.bestPreparations != null)
				return false;
		} else if (!bestPreparations.equals(other.bestPreparations))
			return false;*/
		if (chefCategory == null) {
			if (other.chefCategory != null)
				return false;
		} else if (!chefCategory.equals(other.chefCategory))
			return false;
		if (chefType == null) {
			if (other.chefType != null)
				return false;
		} else if (!chefType.equals(other.chefType))
			return false;
		if (cheffFullName == null) {
			if (other.cheffFullName != null)
				return false;
		} else if (!cheffFullName.equals(other.cheffFullName))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		return true;
		
	}
    
	
	


}
