package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "access_log_wide")
public class AccessLogWide implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "request_time")
    @CreatedDate
    private Date requestTime;

    @Column(name = "request_month")
    private String requestMonth;

    @Column(name = "request_method")
    private String requestMethod;

    @Column(name = "request_path")
    private String requestPath;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_age")
    private int customerAge;

    @Column(name = "customer_birthday")
    private Date customerBirthday;

    @Column(name = "search_hit")
    private int searchHit;

    @Column(name = "referer")
    private String referer;

}
