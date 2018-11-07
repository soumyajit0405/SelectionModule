package com.smo.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmoRepository  extends JpaRepository<Object, Long>{

}
