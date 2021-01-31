package com.reticentdevelopment.task.service;

import com.reticentdevelopment.task.model.Task;
import com.reticentdevelopment.task.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskService {

    @Autowired
    public TaskService(final TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAllByAssignee(final String assigneeName) {
        return repository.findAllByAssigneeIgnoringCase(assigneeName);
    }

    private final TaskRepository repository;
}
