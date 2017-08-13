package uk.co.jamesridgway.spring.boot.oauth2.server.service;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class TaskConverter {

    public TaskConverter() {
    }

    List<Task> convertAll(final List<uk.co.jamesridgway.spring.boot.oauth2.server.data.Task> tasks) {
        return tasks
                .stream()
                .map(this::convert)
                .collect(toList());
    }

    private Task convert(final uk.co.jamesridgway.spring.boot.oauth2.server.data.Task task) {
        return new Task(task.getTask(), task.isCompleted());
    }
}
