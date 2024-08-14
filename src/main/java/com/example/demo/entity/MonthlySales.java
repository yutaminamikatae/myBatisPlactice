package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "monthly_sales")
public class MonthlySales implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "sales_mont")
    private Date salesMont;

    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "sales_amount")
    private int salesAmount;

}
