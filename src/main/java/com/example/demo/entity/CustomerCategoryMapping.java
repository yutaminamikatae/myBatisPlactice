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
@Table(name = "customer_category_mapping")
public class CustomerCategoryMapping implements Serializable {

    private static final long serialVersionUID = 1L;


    @Column(name = "customer_category_id")
    private int customerCategoryId;

    @Column(name = "customer_category_name")
    private String customerCategoryName;

    @Column(name = "customer_category_rank")
    private int customerCategoryRank;

}
