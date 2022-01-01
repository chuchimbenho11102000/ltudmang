package com.nuce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nuce.demo.entity.Product;
import com.nuce.demo.service.ProductService;

@Controller
@RequestMapping(value = "product" ,method = RequestMethod.GET)
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/wiew")
	
 public String wiewProduct(Model model) {
		List<Product> list= productService.findAll();
		model.addAttribute("LIST_PRODUCT",list);
	 return "wiew-product";
	
}
}
