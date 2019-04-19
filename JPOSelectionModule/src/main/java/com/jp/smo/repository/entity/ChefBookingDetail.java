
package com.jp.smo.repository.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.postgresql.geometric.PGpoint;
import org.springframework.data.geo.Point;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jp.smo.component.PGPointType;

import lombok.Data;
import lombok.NoArgsConstructor;
	/**
	 * 
	 * @author EMazhar
	 *
	 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "booking_details")
@TypeDef(name = "type", typeClass = PGPointType.class)
public class ChefBookingDetail implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "booking_id",nullable = false)
		private Long booking_id;
		
		@ManyToOne
		@JoinColumn(name = "chef_id", referencedColumnName = "chef_id")
		private ChefDetail chefDetail;
		
	/*
	 * @NotEmpty
	 * 
	 * @Column(name = "chef_Id") private Long chefId;
	 */
		
		@Column(name = "user_id")
		private Long user_id;
		
		
		@Column(name = "booking_location")
		@Type(type = "type")
		private PGpoint pgPoint;
		
		
		@Column(name = "start_time", nullable = false)
		private LocalDateTime startTime;
		
		
		@Column(name = "end_time",nullable = false)
		private LocalDateTime endTime;

	/*
	 * public Point getPgPoint(double x,double y) { return new Point (x,y); }
	 * 
	 * public void setPgPoint(Point pgPoint) { this.pgPoint = pgPoint; }
	 * 
	 */
	/*
	 * @ManyToOne(cascade= CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "chef_id") private ChefDetail chefDetail;
	 */
		
}
