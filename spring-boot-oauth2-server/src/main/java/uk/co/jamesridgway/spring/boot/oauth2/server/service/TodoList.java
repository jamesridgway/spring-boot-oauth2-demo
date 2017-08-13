package uk.co.jamesridgway.spring.boot.oauth2.server.service;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private String id;
    private String title;
    private List<Task> tasks = new ArrayList<>();

    public TodoList(final String id, final String title, final List<Task> tasks) {
        this.id = id;
        this.title = title;
        this.tasks.addAll(tasks);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
