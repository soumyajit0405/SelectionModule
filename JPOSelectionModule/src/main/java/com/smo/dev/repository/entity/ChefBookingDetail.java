
package com.smo.dev.repository.entity;

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
		private long booking_id;
		
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
		
		
		public long getBooking_id() {
			return booking_id;
		}
		public void setBooking_id(long booking_id) {
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (booking_id ^ (booking_id >>> 32));
			result = prime * result + ((chefDetail == null) ? 0 : chefDetail.hashCode());
			result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
			result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
			result = prime * result + ((usre_id == null) ? 0 : usre_id.hashCode());
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
			ChefBookingDetail other = (ChefBookingDetail) obj;
			if (booking_id != other.booking_id)
				return false;
			if (chefDetail == null) {
				if (other.chefDetail != null)
					return false;
			} else if (!chefDetail.equals(other.chefDetail))
				return false;
			if (endTime == null) {
				if (other.endTime != null)
					return false;
			} else if (!endTime.equals(other.endTime))
				return false;
			if (startTime == null) {
				if (other.startTime != null)
					return false;
			} else if (!startTime.equals(other.startTime))
				return false;
			if (usre_id == null) {
				if (other.usre_id != null)
					return false;
			} else if (!usre_id.equals(other.usre_id))
				return false;
			return true;
		}
		


}
