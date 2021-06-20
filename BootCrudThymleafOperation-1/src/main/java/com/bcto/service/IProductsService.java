package com.bcto.service;

import java.util.List;
import java.util.Optional;

import com.bcto.model.Products;

public interface IProductsService {

	public Integer saveData(Products pro);

	public Optional<Products> getById(Integer id);

	public List<Products> getAllProducts();

	public void removeData(Integer id);
}
