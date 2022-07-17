package com.getarrays.employeemanager.repo;

import com.getarrays.employeemanager.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<OrderDetail, Long> {
    void deleteOrderById(Long id);
    Optional<OrderDetail> findOrderById(Long id);

}
