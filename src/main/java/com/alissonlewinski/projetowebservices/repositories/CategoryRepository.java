package com.alissonlewinski.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonlewinski.projetowebservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
