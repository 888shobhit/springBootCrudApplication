package com.bcto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcto.model.Products;
import com.bcto.serviceimpl.ProductServiceImpl;

@Controller
public class ProductController {
	@Autowired
	private ProductServiceImpl service;

	@GetMapping("/getAll")
	public String getAllProduct(Model model) {
		List<Products> list = service.getAllProducts();
		model.addAttribute(list);
		return "Products : "+ model;
	}

	@GetMapping("/all")
	public String getAllProducts() {
		return "";
	}

	@DeleteMapping("byid")
	public String removeById() {
		return "";
	}

	@PostMapping("/save")
	public String saveProduct() {
		return "";
	}
}
