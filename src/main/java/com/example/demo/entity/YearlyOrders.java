package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "yearly_orders")
public class YearlyOrders implements Serializable {

    private static final long serialVersionUID = 1L;


    @Column(name = "year")
    private int year;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_amount")
    private int orderAmount;

}
