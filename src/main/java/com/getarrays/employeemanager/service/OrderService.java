package com.getarrays.employeemanager.service;

import com.getarrays.employeemanager.model.OrderDetail;
import com.getarrays.employeemanager.repo.OrderRepo;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public OrderDetail addOrder(OrderDetail orderDetail) {
        return orderRepo.save(orderDetail);
    }
}
