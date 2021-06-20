package com.bcto.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcto.model.Products;
import com.bcto.repo.ProductRepository;
import com.bcto.service.IProductsService;

public class ProductServiceImpl implements IProductsService {
	@Autowired
	private ProductRepository repo;

	@Override
	public Optional<Products> getById(Integer id) {
		Optional<Products> opt = repo.findById(id);
		return opt;
	}

	@Override
	public List<Products> getAllProducts() {
		List<Products> list = repo.findAll();
		return list;
	}

	@Override
	public void removeData(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Integer saveData(Products pro) {
		double gst=pro.getGst()*8/100;
		double discount=pro.getDiscount()*12/100;
		pro.setGst(gst);
		pro.setDiscount(discount);
		Integer id=repo.save(pro).getProdid();
		return id;
	}

	
	}

