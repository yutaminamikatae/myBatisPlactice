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
@Table(name = "search_log_dyn")
public class SearchLogDyn implements Serializable {

    private static final long serialVersionUID = 1L;


    @Column(name = "search_id")
    private int searchId;

    @Column(name = "search_time")
    @CreatedDate
    private Date search_time;

    @Column(name = "search_words")
    private String search_words;

}
