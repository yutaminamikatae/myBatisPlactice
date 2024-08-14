package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "order_id")
    private int orderId;

    @CreatedDate
    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_amount")
    private int orderAmount;

}
