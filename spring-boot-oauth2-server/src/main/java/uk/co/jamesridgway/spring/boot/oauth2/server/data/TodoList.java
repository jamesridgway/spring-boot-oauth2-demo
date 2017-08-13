package uk.co.jamesridgway.spring.boot.oauth2.server.data;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    @Id
    private String id;

    private String name;

    private List<Task> tasks = new ArrayList<>();

    public TodoList() {
    }

    public TodoList(final String name, final List<Task> tasks) {
        this.name = name;
        this.tasks.addAll(tasks);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        // TODO: Unmodifiable
        return tasks;
    }


}
