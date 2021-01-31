package com.reticentdevelopment.task;

import com.reticentdevelopment.task.web.TaskController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {TaskApplication.class})
class TaskApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TaskController taskController;

	@Test
	void contextLoads() {

	}

	@Test
	public void testEndToEnd() {
		var result = given().standaloneSetup(taskController)
				.when()
				.get(String.format("http://localhost:%s/api/v1/tasks?assignee=crocker", port))
				.as(List.class);

		assertEquals(2, result.size());
	}
}
