package com.jp.smo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jp.smo.repository.entity.ChefDishMapping;
import com.jp.smo.repository.entity.DishDetail;

@Repository
public interface ChefDishMappingRepository extends JpaRepository<DishDetail,Long> {

	@Query("Select dd from DishDetail dd where dd.dishId =?1")
	DishDetail findOneByDishId(Long Id);
}
