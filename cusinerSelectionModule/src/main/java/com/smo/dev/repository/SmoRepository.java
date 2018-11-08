package com.smo.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smo.dev.entity.CheffDetail;

@Repository
public interface SmoRepository  extends JpaRepository<CheffDetail, Long>{
	
	List<CheffDetail> getAllCheffByCusineType(String cusine);
}
