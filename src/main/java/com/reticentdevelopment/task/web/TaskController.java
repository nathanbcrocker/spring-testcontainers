package com.reticentdevelopment.task.web;

import com.reticentdevelopment.task.model.Task;
import com.reticentdevelopment.task.service.TaskService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    public TaskController(final TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> findAllByAssigneeName(@RequestParam("assignee") String assigneeName) {
        return service.findAllByAssignee(assigneeName);
    }

    @Getter
    private final TaskService service;
}
