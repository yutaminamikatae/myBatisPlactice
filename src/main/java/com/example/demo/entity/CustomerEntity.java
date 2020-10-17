package com.example.demo.entity;

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
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@Column(name = "customercode")
	private String customercode;

	@Column(name = "customername")
	private String customername;

	@Column(name = "adress")
	private String adress;

	@Column(name = "phonenumber")
	private String phonenumber;

	@Column(name = "staffcode")
	private String staffcode;
}
