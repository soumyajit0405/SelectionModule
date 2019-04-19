package com.jp.smo.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jp.smo.repository.entity.ChefBookingDetail;
import com.jp.smo.repository.entity.ChefDetail;
/**
 * 
 * @author Ehtu
 *
 */
public interface SmoBookingRepository extends JpaRepository<ChefBookingDetail, Long>{
	/*findByAgeNotIn
	List<Log> findNotInIdByBookingStartTimeAndBookingEndTime()

	//@Query("select cbk.chefDetail.chefId from ChefBookingDetail cbk where cbk.startTime NOT IN (:bookingStartTime ,:bookingEndTime)")
	List<Long> findAllChefIdByBookinTime(Date bookingStartTime, Date bookingEndTime);
	
}*/
	/*
	 * @Query("select cd ChefDetail cd where ") List<ChefDetail>
	 * findAllByBookingStartTimeAndBookingEndTime(@Param("bookingStartTime")
	 * LocalDateTime bookingStartTime, @Param("bookingEndTime")LocalDateTime
	 * bookingEndTime);
	 */
	
}