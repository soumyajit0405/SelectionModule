package com.jp.smo.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryTariffDto {

	private Long categgoryTariffId;
	
	private Integer chefCategory;
	private Double baseTariff;
	private Double extraPersonTariff;
	private Double extraStarterTariff;
	private Double extraMainCourseTariff;
	private Double extraAccompanimentsTariff;
	private Double extraDessertTariff;
	

}
