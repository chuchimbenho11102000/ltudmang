package com.nuce.demo.controller;
import com.nuce.demo.entity.*;
import com.nuce.demo.service.CategoriService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
	
	@Autowired
	CategoriService categoriService;
	
	@RequestMapping(value = {"/login"} ,method = RequestMethod.GET)
	public String login() {
		return "Login";
	}


	@RequestMapping(value = "/dangki")
	public String DangKi()
	{
		return "register-user";
	}
	
	@RequestMapping(value = "/{ten}/{pass}/test" ,method = RequestMethod.GET)
	public String test(@PathVariable(name = "ten") String name, @PathVariable(name = "pass") String pass, ModelMap model)
	{
		model.addAttribute("ten",name);
		model.addAttribute("pass",pass);
		return "test";
	}
	
	@RequestMapping(name = "/")
	public String Cart(Model model )
			
	{
		
		List<Categori> danhsach = categoriService.findAll();
		model.addAttribute("listcart",danhsach);
		return "cart";
	}
}
