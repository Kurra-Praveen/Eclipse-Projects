package com.springboot.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="menu")


public class MenuItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "item_name",nullable = false)
	private String name;
	
	@Column(name = "categeory",nullable = true)
	private String categeory;
	
	@Column(name = "price",nullable = false)
	private float price;
	
	@Column(name="rating",nullable=false)
	private float rating;
	
	@Column(name="country",nullable=true)
	private String country;
	
	@Column(name="description",nullable = true)
	private String description;

}
