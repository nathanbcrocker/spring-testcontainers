package com.reticentdevelopment.task.web;

import com.reticentdevelopment.task.TaskApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {TaskApplication.class})
@AutoConfigureMockMvc
class TaskControllerTest {
    @Test
    public void testTasks() throws Exception {
        mockMvc.perform(
                get("/api/v1/tasks?assignee=crocker"))
                .andExpect(status().isOk())
                ;
    }

    @Autowired
    private MockMvc mockMvc;
}