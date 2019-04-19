package com.jp.smo.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jp.smo.repository.entity.ChefDetail;

/**
 * 
 * @author Ehtu
 *
 */
@Repository
public interface SmoRepository extends JpaRepository<ChefDetail, Long> {
	/*
	 * List<CheffDetail> getAllCheffByCusineType(String cusine); public final static
	 * String FIND_BY_BOOKING_TIME = "SELECT FROM ChefDetail " +
	 * "WHERE ChefDetail.chef_id = (select chef_id from ChefDetail.ChefBookingDetail.ChefBookingDetail where ChefDetail.ChefBookingDetail.bookingStartTime NOT BETWEEN bookingStartTime AND bookingEndTime)"
	 * ;
	 * 
	 * @Query("select cd from ChefDetail cd where cd.chefId = (select bk.chefDetail.chefId from cd.ChefBookingDetail bk where bk.startTime NOT BETWEEN :bookingStartTime AND :bookingEndTime)"
	 * )
	 * 
	 * @Query("select u.userName from User u inner join u.area ar where ar.idArea = :idArea"
	 * )
	 * 
	 * @Query("select cd from ChefDetail cd left join cd.chefBookingDetail cbkd where cbkd.startTime NOT BETWEEN :bookingStartTime AND :bookingEndTime"
	 * ) List<ChefDetail> getAllChefByBookingTime(LocalDateTime bookingStartTime,
	 * LocalDateTime bookingEndTime);
	 */
	@Query("Select chefDetail from ChefDetail chefDetail where chefDetail.chefId=?1")
	ChefDetail findByChefId(long chefId);

	
	@Query("SELECT cd FROM ChefDetail cd LEFT OUTER JOIN ChefBookingDetail bd ON cd.chefId = bd.chefDetail.chefId"  + " where (bd.startTime =null AND bd.endTime = null) OR (bd.startTime > ?2 OR bd.endTime <?1)") 
	Set<ChefDetail> findAvailableChefBasedOnBookingTime(@Param("bookingStartTime") LocalDateTime bookingStartTime,
			@Param("bookingEndTime") LocalDateTime bookingEndTime);
	//@Query("Select cd from ChefDetail cd where cd.chefId NOT IN (Select bd.chefId from ChefBookingDetail bd)")
	//List<ChefDetail> findAllChefNotBooked(); 
}
