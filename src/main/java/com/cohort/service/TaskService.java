package com.cohort.service;

import com.cohort.exception.TaskNotFoundException;
import com.cohort.model.Task;
import com.cohort.repository.TaskRepository;

import java.time.LocalDate;
import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(
            Long id,
            String title,
            String description,
            String priority
    ) {

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be empty.");
        }

        Task task = new Task(
                id,
                title,
                description,
                priority,
                LocalDate.now()
        );

        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Task updateTaskStatus(Long id, boolean completed) {

        Task task = getTaskById(id);

        if (completed) {
            task.markAsCompleted();
        } else {
            task.markAsPending();
        }

        return task;
    }
}