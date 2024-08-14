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
@Table(name = "order_details_v")
public class OrderDetailsV implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "item_id")
    private int item_id;

}
