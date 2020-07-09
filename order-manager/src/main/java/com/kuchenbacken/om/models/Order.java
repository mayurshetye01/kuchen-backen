package com.kuchenbacken.om.models;

import com.kuchenbacken.om.enums.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class Order {
    private UUID id;
    private List<Item> items;
    private Date created;
    private OrderStatus status;
}
