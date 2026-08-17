package com.cohort;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1L, "Vote buying", "This is not true", "High", LocalDate.now()));
        tasks.add(new Task(2L, "Vote buying attempt", "This is what i meant", "Low", LocalDate.now()));
        tasks.add(new Task(2L, "Vote buying attempt", "This is what i meant", "Medium", LocalDate.now()));

        tasks.get(2).markAsCompleted();
        tasks.get(0).getDescription();
        tasks.get(1).getCreationDate();

        for (Task task : tasks) {
            System.out.println(task.getTitle() + " | completed: " + task.isCompleted());
            System.out.println(task.getDescription());
            System.out.println(task.getCreationDate());
        }
    }
}

//Beginner:
//improve the task manager by adding:
//
//•Task description
//•Task priority
//•Task creation date
//•method for updating the title
//•method for displaying task details
//•At least five sample tasks