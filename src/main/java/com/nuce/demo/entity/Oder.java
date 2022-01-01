package com.nuce.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Oders")

public class Oder implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	
	private String address;
	private String fullname;
	private String email;
	
	
	
 
	@Temporal(TemporalType.DATE)
	Date createDate = new Date();
	
	
	
	@OneToMany (mappedBy = "oder")
	List<OderDetail> oderDetails;

	

	
	
}
