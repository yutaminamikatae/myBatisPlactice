package com.example.demo.entity;

import java.io.Serializable;

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
@Table(name = "web_pages")
public class WebPages implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "shop_name")
    private String shopName;

}
