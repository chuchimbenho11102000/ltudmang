package com.nuce.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Categories")
public class Categori implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String id;
	String name;
	@JsonIgnore
	@OneToMany(mappedBy = "categori")
	List<Product> products;
}