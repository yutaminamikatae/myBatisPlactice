package com.example.demo.controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.entity.Todo2;
import com.example.demo.service.Todo2XmlService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(TodoController.class)
public class TodoControllerTest {

	@Autowired
	private WebApplicationContext wac;

	@Autowired
	MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	@MockBean
	Todo2XmlService todo2XmlService;

	ObjectMapper om = new ObjectMapper();

	//	@MockBean
	//	TodoXmlService todoXmlService;

	@BeforeEach
	private void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testcase001() throws Exception {

		String strDate = "2024/07/16";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = dateFormat.parse(strDate);

		Todo2 todo2 = new Todo2();
		todo2.setTodoId("1");
		todo2.setTodoTitle("test");
		todo2.setFinished(true);
		todo2.setCreatedAt(date);
		String jsonRequest = om.writeValueAsString(todo2);

		// ServiceのgetMessageメソッドをモック化
		doReturn(todo2).when(todo2XmlService).findOne(todo2);

		//MvcResult
		String result = mockMvc.perform(
				post("/todo2/one").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn()
				.getResponse()
				.getContentAsString()
				;

		
		Todo2 todoRespose = om.readValue(result, Todo2.class);
    	System.out.println(todoRespose.getTodoId());
    	System.out.println(todoRespose.getTodoTitle());
    	System.out.println(todoRespose.getFinished());
    	System.out.println(todoRespose.getCreatedAt());
		
    	
//		System.out.print(result);
//		String todoId = result.get("todoId").textValue(); 
//		String todoTitle = result.get("todoTitle").textValue(); 
//		Boolean finished = result.get("finished").booleanValue(); 
//		Date createdAt = result.get("createdAt").dateValue(); 
    	
//		String resultContent = result.getResponse().getContentAsString();
//		Response response = om.readValue(resultContent, Response.class);
//
//		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

		//.andExpect(content().string(containsString("test")));
		//content().string(containsString("商品01"))
		//content().string(containsString("商品02"))

		// 期待している返り値
		//        String expected = "モック化できたよ";
		// 実際の返り値
		//        String actual = todoController.getTodo(todo2);
		//        System.out.println(actual);

		// 呼び出し回数確認
		//        verify(todo2XmlService, times(1)).getMessage(1);

		// 期待している返り値と実際の返り値を比較検証
		//        assertThat(actual, is(expected));
	}

}
