package com.matheusbus.Estudos.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbus.Estudos.Spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
