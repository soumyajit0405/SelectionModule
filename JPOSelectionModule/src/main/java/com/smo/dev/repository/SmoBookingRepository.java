package com.smo.dev.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.smo.dev.entity.ChefBookingDetail;
/**
 * 
 * @author Ehtu
 *
 */
public interface SmoBookingRepository extends JpaRepository<ChefBookingDetail, Long>{
	/*findByAgeNotIn
	List<Log> findNotInIdByBookingStartTimeAndBookingEndTime()
*/
	@Query("select cbk.chefDetail.chefId from ChefBookingDetail cbk where cbk.startTime NOT IN (:bookingStartTime ,:bookingEndTime)")
	List<Long> findAllChefIdByBookinTime(Date bookingStartTime, Date bookingEndTime);
}
