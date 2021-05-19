package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Todo2;
import com.example.demo.mapper.Todo2XmlMapper;

@Service
public class Todo2XmlService {



	@Autowired
	Todo2XmlMapper todo2XmlMapper;

	@Transactional
	public Todo2 findOne(Todo2 todo2) {

		return todo2XmlMapper.findOne(todo2);
	}

	@Transactional
	public void create(Todo2 todo2) {
		todo2XmlMapper.create(todo2);
	}

	@Transactional
	public void update(Todo2 todo2) {
		todo2XmlMapper.update(todo2);
	}




	@Transactional
	public void delete(Todo2 todo2) {
		todo2XmlMapper.delete(todo2);
	}


	@Transactional
	public long count() {
		return todo2XmlMapper.count();
	}



}
