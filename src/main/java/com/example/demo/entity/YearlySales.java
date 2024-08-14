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
@Table(name = "yearly_sales")
public class YearlySales implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "year")
    private int year;

    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "sales_amount")
    private int salesAmount;

}
