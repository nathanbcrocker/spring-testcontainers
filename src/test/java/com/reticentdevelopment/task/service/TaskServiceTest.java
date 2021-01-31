package com.reticentdevelopment.task.service;

import com.reticentdevelopment.task.TaskApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {TaskApplication.class})
class TaskServiceTest {
    @Autowired
    private TaskService taskService;

    @Test
    public void testTaskCount() {
        assertEquals(2, taskService.findAllByAssignee("crocker").size());
    }
}