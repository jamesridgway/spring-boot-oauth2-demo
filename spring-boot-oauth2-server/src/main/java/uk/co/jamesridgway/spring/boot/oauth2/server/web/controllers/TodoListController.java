package uk.co.jamesridgway.spring.boot.oauth2.server.web.controllers;

import org.springframework.web.bind.annotation.*;
import uk.co.jamesridgway.spring.boot.oauth2.server.service.TodoList;
import uk.co.jamesridgway.spring.boot.oauth2.server.service.TodoListService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/todo-list")
public class TodoListController {

    private TodoListService todoListService;

    public TodoListController(final TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @RequestMapping(path = "/", method =  GET)
    public List<TodoList> getTodoLists() {
        return todoListService.getAllTodoLists();
    }

    @RequestMapping(path = "/{todoListId}", method =  GET)
    public TodoList getTodoList(final @PathVariable("todoListId") String todoListId) {
        return todoListService.getTodoList(todoListId);
    }
}
