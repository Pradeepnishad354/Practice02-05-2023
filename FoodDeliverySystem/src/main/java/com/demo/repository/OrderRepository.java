package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

	
	@Query("from Order as o where o.staff.id=:orderId")
	public List<Order> findOrdersByStaff(@Param("orderId")int orderId);
}
