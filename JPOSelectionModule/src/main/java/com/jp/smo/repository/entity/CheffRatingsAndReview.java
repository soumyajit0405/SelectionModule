package com.smo.dev.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="general_chef_valuation")
public class CheffRatingsAndReview implements Serializable{
	
	@NotEmpty
	@Column(name = "chef_id", nullable = false)
	private long chefId;
	
	@NotEmpty
	@Id
	@Column(name = "general_rating_id", nullable = false)
	private int generalRatingId;
	
	@NotEmpty
	@Column(name = "ratings_count", nullable = false)
	private int ratingCount;
	
	@NotEmpty
	@Column(name = "average_rating_value", nullable = false)
	private float avgRatingVal;
	
	public CheffRatingsAndReview() {}
	public long getChefId() {
		return chefId;
	}
	public void setChefId(long chefId) {
		this.chefId = chefId;
	}
	public int getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}
	public float getAvgRatingVal() {
		return avgRatingVal;
	}
	public void setAvgRatingVal(float avgRatingVal) {
		this.avgRatingVal = avgRatingVal;
	}
	
}
