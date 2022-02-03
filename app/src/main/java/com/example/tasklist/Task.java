package com.example.tasklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task {
    String description;
    int priority;
    String date;

    public ArrayList<Task> Todo = new ArrayList<>(); // ArrayList of Tasks

    public Task(String description, int priority, String date) {
        this.description = description;
        this.priority = priority;
        this.date = date;
    }

    public void addTask(String description, int priority, String date) {
        if (priority > 3 || priority < 1) {
            System.out.println(description + " has invalid priority ");
        }

        Todo.add(new Task(description, priority, date));   // Add Task
    }


    public void getTodoList() {
        // Iterate over Todo ArrayList
        for (Task task : Todo){
            System.out.println(task);
        }

    }

}
