package com.kuchenbacken.om.restapi.controllers;

import com.kuchenbacken.om.enums.OrderStatus;
import com.kuchenbacken.om.models.Order;
import org.springframework.web.bind.annotation.*;

@RestController("/order-manager/v1/orders")
public class OrdersController {

    @GetMapping("{id}")
    public Order get(String id){
        return null;
    }

    @PostMapping
    public void place(@RequestBody Order order){

    }

    @PutMapping("{id}/status")
    public void updateStatus(String id, @RequestBody OrderStatus orderStatus){

    }
}
