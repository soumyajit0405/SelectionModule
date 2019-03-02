package com.smo.dev.repository;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smo.dev.entity.ChefDetail;
import com.smo.dev.entity.ChefExtraDetail;
/**
 * 
 * @author Ehtu
 *
 */
@Repository
public interface SmoRepository  extends JpaRepository<ChefDetail, Integer>{
	
	//List<CheffDetail> getAllCheffByCusineType(String cusine);
	/*public final static String FIND_BY_BOOKING_TIME = "SELECT FROM ChefDetail " +
            "WHERE ChefDetail.chef_id = (select chef_id from ChefDetail.ChefBookingDetail.ChefBookingDetail where ChefDetail.ChefBookingDetail.bookingStartTime NOT BETWEEN bookingStartTime AND bookingEndTime)";*/

	//@Query("select cd from ChefDetail cd where cd.chefId = (select bk.chefDetail.chefId from cd.ChefBookingDetail bk where bk.startTime NOT BETWEEN :bookingStartTime AND :bookingEndTime)")
	//@Query("select u.userName from User u inner join u.area ar where ar.idArea = :idArea")
	@Query("select cd from ChefDetail cd left join cd.chefBookingDetail cbkd where cbkd.startTime NOT BETWEEN :bookingStartTime AND :bookingEndTime")
    List<ChefDetail> getAllChefByBookingTime(LocalDateTime bookingStartTime, LocalDateTime bookingEndTime);

	
}
