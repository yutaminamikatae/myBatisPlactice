package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Todo;

@Mapper
public interface TodoXmlMapper {

	//findById
	// １件取得 (1)
	public Todo findOne(Todo todo);

	List<Todo> findAll(); // 全件取得

	void create(Todo todo); // 挿入

	boolean update(Todo todo); // 更新

	void delete(Todo todo); // 削除

	long count(Todo todo); // 条件に合致するレコードをカウント (2)

}
