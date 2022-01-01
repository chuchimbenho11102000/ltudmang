package com.nuce.demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuce.demo.dao.CategoriDAO;
import com.nuce.demo.entity.Categori;
import com.nuce.demo.service.CategoriService;

@Service
public class CategoriServiceImpl implements CategoriService{
   @Autowired
   CategoriDAO cate;

@Override
public List<Categori> findAll() {
	return cate.findAll();
}
   
}
