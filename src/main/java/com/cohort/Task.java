package com.cohort;

import java.time.LocalDate;

public class Task {

    private final Long id;
    private final String title;
    private boolean completed;
    private String description;
    private String priority;
    private LocalDate creationDate;

    public Task(Long id, String title, String description, String priority, LocalDate creationDate){
        this.id = id;
        this.title = title;
        this.completed = false;
        this.description = description;
        this.priority = priority;
        this.creationDate = creationDate;
    }

    public void markAsCompleted(){
        this.completed = true;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() { return description; }

    public String getPriority() { return priority; }

    public LocalDate getCreationDate() { return creationDate; }
}

