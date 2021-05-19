package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.entity.Todo2;
import com.example.demo.service.Todo2XmlService;
import com.example.demo.service.TodoXmlService;

@RestController
public class TodoController {

	@Autowired
	TodoXmlService todoXmlService;

	@Autowired
	Todo2XmlService todo2XmlService;



	//１件取得 全件取得　挿入　更新　削除　件数取得
	//myBatis

	//↓


	// １件取得 (1)
	//curl -X POST http://localhost:8000/todo2/one -H "Content-type: application/json" -d "{\"todoId\":\"1\"}"
	@RequestMapping(path = "/todo2/one", method = RequestMethod.POST)
	public Todo2 getTodo(@RequestBody  @Validated Todo2 todo2,BindingResult result) {

		if(result.hasErrors()) {
			throw new RuntimeException();
		}

		return todo2XmlService.findOne(todo2);
	}


	// 挿入
	//curl -X POST http://localhost:8000/create -H "Content-type: application/json" -d "{\"todoId\":\"2\",\"todoTitle\":\"def\",\"finished\":\"true\"}"
	@RequestMapping(path = "/create", method = RequestMethod.POST)
	public void createTodo(@RequestBody Todo2 todo2) {
		todo2XmlService.create(todo2);
	}

	//curl -X POST http://localhost:8000/todo/all -H "Content-type: application/json"
	@RequestMapping(path = "/todo/all", method = RequestMethod.POST)
	public List<Todo> getAllTodo() {

		// 全件取得

		return todoXmlService.findAll();
	}

	// 更新
	//curl -X POST http://localhost:8000/update -H "Content-type: application/json" -d "{\"todoId\":\"2\",\"todoTitle\":\"ddd\",\"finished\":\"true\"}"
		@RequestMapping(path = "/update", method = RequestMethod.POST)
		public void updateTodo(@RequestBody Todo2 todo2) {
			todo2XmlService.update(todo2);
		}

		// delete
		//curl -X POST http://localhost:8000/delete -H "Content-type: application/json" -d "{\"todoId\":\"4\"}"
			@RequestMapping(path = "/delete", method = RequestMethod.POST)
			public void deleteTodo(@RequestBody Todo2 todo2) {
				todo2XmlService.delete(todo2);
			}

		//count
		//curl -X POST http://localhost:8000/count -H "Content-type: application/json"
		@RequestMapping(path = "/count", method = RequestMethod.POST)
		public long countTodo() {
			return todo2XmlService.count();
		}

//
//


		//curl -X POST http://localhost:8000/todo/one -H "Content-type: application/json" -d "{\"todo_id\":\"1\"}"
		@RequestMapping(path = "/todo/one", method = RequestMethod.POST)
		public Todo getTodo(@RequestBody Todo todo) {

			// １件取得 (1)

			return todoXmlService.findOne(todo);
		}



}
