package uk.co.jamesridgway.spring.boot.oauth2.server.service;

import org.springframework.stereotype.Service;
import uk.co.jamesridgway.spring.boot.oauth2.server.data.TodoListRepository;

import java.util.List;

@Service
public class TodoListService {

    private TodoListRepository todoListRepository;

    private TodoListConverter converter = new TodoListConverter();

    public TodoListService(final TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoList> getAllTodoLists() {
        return converter.convertAll(todoListRepository.findAll());
    }

    public TodoList getTodoList(final String todoListId) {
        return converter.convert(todoListRepository.findOne(todoListId));
    }

}
