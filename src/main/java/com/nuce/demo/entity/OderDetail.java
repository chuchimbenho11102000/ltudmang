package com.nuce.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
/*@Table(name = "Oderdetails" ,uniqueConstraints = {
		@UniqueConstraint(columnNames = {"Oderid","Productid"})
})*/
@Data
@Table(name = "Oderdetails")
public class OderDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	
	private Double price;
	
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name="Productid")
	Product product;
	@ManyToOne
	@JoinColumn(name="Oderid")
	Oder oder;
	
	
	
	

}
