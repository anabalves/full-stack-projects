package com.devsuperior.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devsuperior.dsdelivery.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
