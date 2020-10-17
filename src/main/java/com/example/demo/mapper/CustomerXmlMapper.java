package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.CustomerEntity;

@Mapper
public interface CustomerXmlMapper {

	public CustomerEntity findOne(CustomerEntity customerEntity);

}
