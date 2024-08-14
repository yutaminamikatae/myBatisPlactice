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
@Table(name = "access_log")
public class AccessLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "request_method")
    private String requestMethod;

    @Column(name = "request_path")
    private String requestPath;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "search_hit")
    private int searchHit;

    @Column(name = "referer")
    private String referer;
}
