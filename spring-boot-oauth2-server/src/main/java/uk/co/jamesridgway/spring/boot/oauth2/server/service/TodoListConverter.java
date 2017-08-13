package uk.co.jamesridgway.spring.boot.oauth2.server.service;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class TodoListConverter {

    private TaskConverter taskConverter = new TaskConverter();

    public List<TodoList> convertAll(final List<uk.co.jamesridgway.spring.boot.oauth2.server.data.TodoList> todoLists) {
        return todoLists
                .stream()
                .map(this::convert)
                .collect(toList());
    }

    public TodoList convert(final uk.co.jamesridgway.spring.boot.oauth2.server.data.TodoList todoList) {
        return new TodoList(todoList.getId(), todoList.getName(), taskConverter.convertAll(todoList.getTasks()));
    }

}
