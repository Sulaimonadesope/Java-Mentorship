package com.cohort.repository;

import com.cohort.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public Task save(Task task) {
        tasks.add(task);
        return task;
    }

    public List<Task> findAll() {
        return tasks;
    }

    public Optional<Task> findById(Long id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst();
    }
}