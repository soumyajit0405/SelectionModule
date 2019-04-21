package com.jp.smo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.smo.repository.entity.CategoryTariff;

@Repository
public interface CategoryTariffRepository extends JpaRepository<CategoryTariff, Long> {

}
