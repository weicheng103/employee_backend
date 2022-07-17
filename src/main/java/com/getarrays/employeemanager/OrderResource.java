package com.getarrays.employeemanager;

import com.getarrays.employeemanager.model.OrderDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.getarrays.employeemanager.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderResource {

    private final OrderService orderService;

    public OrderResource(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/add")
    public ResponseEntity<OrderDetail> addOrder(@RequestBody OrderDetail orderDetail) {
        OrderDetail newOrderDetail = orderService.addOrder(orderDetail);
        return new ResponseEntity<>(newOrderDetail, HttpStatus.CREATED);
    }
}
