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
@Table(name = "access_log_dyn")
public class AccessLogDyn implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "request_time")
    @CreatedDate
    private Date requestTime;

    @Column(name = "request_path")
    private String requestPath;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "json_params")
    private String jsonParams;


}
