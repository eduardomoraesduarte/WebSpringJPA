package com.deveduardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deveduardo.entities.OrderItem;
import com.deveduardo.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
