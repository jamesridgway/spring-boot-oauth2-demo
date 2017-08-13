package uk.co.jamesridgway.spring.boot.oauth2.server.service;

public class Task {

    private String task;
    private boolean completed;

    public Task(String task, boolean completed) {
        this.task = task;
        this.completed = completed;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }
}
