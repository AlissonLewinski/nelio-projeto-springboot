package com.alissonlewinski.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonlewinski.projetowebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
