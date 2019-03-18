
package com.jp.smo.repository.entity;

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

import org.springframework.data.geo.Point;

import lombok.Data;
	/**
	 * 
	 * @author EMazhar
	 *
	 */
@Data
	@Entity
	@Table(name = "booking_details")
	public class ChefBookingDetail implements Serializable{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "booking_id",nullable = false)
		private Long booking_id;
		
		@ManyToOne
		@JoinColumn(name = "chef_id", referencedColumnName = "chef_id")
		private ChefDetail chefDetail;
		
		@NotEmpty
		@Column(name = "user_id")
		private String user_id;
		private Point pgPoint;
		
		@NotEmpty
		@Column(name = "booking_start_time", nullable = false)
		private LocalDateTime startTime;
		
		@NotEmpty
		@Column(name = "booking_end_time",nullable = false)
		private LocalDateTime endTime;
		
	    
		/*@ManyToOne(cascade= CascadeType.ALL)
	    @JoinColumn(name = "chef_id")
	    private ChefDetail chefDetail;*/
	
}