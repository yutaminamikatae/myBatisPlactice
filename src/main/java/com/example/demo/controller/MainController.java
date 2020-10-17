package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.service.CustomerXmlService;

@RestController
public class MainController {

	@Autowired
	private CustomerXmlService customerXmlService;



	//MyBatiso のみのプロジェクト



	//curl -X POST http://localhost:8000/customer -H "Content-type: application/json" -d "{\"customercode\":\"8\"}"
	@RequestMapping(path = "/customer", method = RequestMethod.POST)
	public CustomerEntity getCustomer(@RequestBody CustomerEntity customerEntity) {

		CustomerEntity responseCustomerEntity = customerXmlService.findOne(customerEntity);



		return responseCustomerEntity;
	}







}
