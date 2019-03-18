package com.jp.smo.dto;

import java.io.File;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Ehtu
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishDetailDTO {

	private int dishId;
	
	private String dishName;
	
	private String description;
	
	private File dishImage;
	
	private byte[] dishVideo;
	
	private String type;	
}