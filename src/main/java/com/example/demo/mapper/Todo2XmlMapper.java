package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Todo2;


@Mapper
public interface Todo2XmlMapper {

	// １件取得 (1)
		public Todo2 findOne(Todo2 todo2);

		// 挿入
		void create(Todo2 todo2);

		// 更新
		boolean update(Todo2 todo2);

		// 削除
		void delete(Todo2 todo2);

		// 条件に合致するレコードをカウント (2)
		long count();

}
