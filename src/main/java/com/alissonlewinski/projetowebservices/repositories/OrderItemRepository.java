package com.alissonlewinski.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonlewinski.projetowebservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
