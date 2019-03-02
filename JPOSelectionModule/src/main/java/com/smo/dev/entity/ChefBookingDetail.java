
	package com.smo.dev.entity;

	import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
	/**
	 * 
	 * @author Ehtu
	 *
	 */
	@Entity
	@Table(name = "chef_booking_detail")
	public class ChefBookingDetail implements Serializable{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "booking_id",nullable = false)
		private String booking_id;
		
		@ManyToOne
		@JoinColumn(name = "chef_id", referencedColumnName = "chef_id")
		private ChefDetail chefDetail;
		
		@NotEmpty
		@Column(name = "usre_id")
		private String usre_id;
		
		@NotEmpty
		@Column(name = "booking_start_time", nullable = false)
		private LocalDateTime startTime;
		
		@NotEmpty
		@Column(name = "booking_end_time",nullable = false)
		private LocalDateTime endTime;
		
	    
		/*@ManyToOne(cascade= CascadeType.ALL)
	    @JoinColumn(name = "chef_id")
	    private ChefDetail chefDetail;*/
		
		public ChefDetail getChefDetail() {
			return chefDetail;
		}
		public void setChefDetail(ChefDetail chefDetail) {
			this.chefDetail = chefDetail;
		}
		
		public String getBooking_id() {
			return booking_id;
		}
		public void setBooking_id(String booking_id) {
			this.booking_id = booking_id;
		}
		public String getUsre_id() {
			return usre_id;
		}
		public void setUsre_id(String usre_id) {
			this.usre_id = usre_id;
		}
		/*public Date getStartTime() {
			return startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Date getEndTime() {
			return endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}*/
		public LocalDateTime getStartTime() {
			return startTime;
		}
		public void setStartTime(LocalDateTime startTime) {
			this.startTime = startTime;
		}
		public LocalDateTime getEndTime() {
			return endTime;
		}
		public void setEndTime(LocalDateTime endTime) {
			this.endTime = endTime;
		}
		


}
