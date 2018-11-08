package com.smo.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smo.dev.entity.CheffDetail;

@Repository
public interface SmoRepository  extends JpaRepository<CheffDetail, Long>{

}
