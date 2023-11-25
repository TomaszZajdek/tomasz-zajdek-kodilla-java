package com.kodilla.spring.portfolio;


import java.util.*;


public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTasks(String task) {
        tasks.add(task);
    }
}
