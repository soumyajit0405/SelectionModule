package com.jp.smo.dto;

public class RatingAndReview {

	private float avgRating;
	private int reviewCount;
	public RatingAndReview() {}
	
	public float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	
}
