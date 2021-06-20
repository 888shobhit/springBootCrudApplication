package com.bcto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcto.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
