package com.kuchenbacken.om.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Item {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
}
