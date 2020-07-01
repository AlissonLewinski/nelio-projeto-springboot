package com.alissonlewinski.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonlewinski.projetowebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
