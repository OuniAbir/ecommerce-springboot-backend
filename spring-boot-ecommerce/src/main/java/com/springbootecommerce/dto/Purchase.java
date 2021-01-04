package com.springbootecommerce.dto;

import java.util.Set;

import com.springbootecommerce.entity.Address;
import com.springbootecommerce.entity.Customer;
import com.springbootecommerce.entity.Order;
import com.springbootecommerce.entity.OrderItem;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}