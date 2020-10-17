package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.mapper.CustomerXmlMapper;

@Service
public class CustomerXmlService {

	@Autowired
	private CustomerXmlMapper customerXmlMapper;

	@Transactional
	public CustomerEntity findOne(CustomerEntity customerEntity) {

		CustomerEntity responseCustomerEntity = customerXmlMapper.findOne(customerEntity);

		return responseCustomerEntity;
	}


}
