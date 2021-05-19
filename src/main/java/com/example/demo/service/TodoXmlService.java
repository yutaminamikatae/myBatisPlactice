package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Todo;
import com.example.demo.mapper.TodoXmlMapper;

@Service
public class TodoXmlService {


	@Autowired
	TodoXmlMapper todoXmlMapper;


	@Transactional
	public Todo findOne(Todo todo) {

		Todo responseTodo = todoXmlMapper.findOne(todo);

		return responseTodo;
	}


	@Transactional
	public List<Todo> findAll(){
		return todoXmlMapper.findAll();
	}


}
