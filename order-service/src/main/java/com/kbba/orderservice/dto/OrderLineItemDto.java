package com.kbba.orderservice.dto;

import com.kbba.orderservice.model.Order;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemDto {
    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
    private Order order;
}
