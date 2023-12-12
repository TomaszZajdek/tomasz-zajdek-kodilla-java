package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{


    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = false;

    DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task");
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
