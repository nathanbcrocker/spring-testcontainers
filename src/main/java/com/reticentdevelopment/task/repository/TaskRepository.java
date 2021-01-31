package com.reticentdevelopment.task.repository;

import com.reticentdevelopment.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByAssigneeIgnoringCase(final String assigneeName);
}
