package com.nuce.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nuce.demo.entity.Product;
@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {

}
