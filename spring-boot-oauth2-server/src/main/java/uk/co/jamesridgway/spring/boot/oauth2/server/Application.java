package uk.co.jamesridgway.spring.boot.oauth2.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import uk.co.jamesridgway.spring.boot.oauth2.server.data.Task;
import uk.co.jamesridgway.spring.boot.oauth2.server.data.TodoList;
import uk.co.jamesridgway.spring.boot.oauth2.server.data.TodoListRepository;

import java.util.ArrayList;
import java.util.List;

@EnableAuthorizationServer
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private TodoListRepository todoListRepository;

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {

        if (todoListRepository.count() == 0) {
            List<Task> tasks = new ArrayList<>();
            tasks.add(Task.completed("Butter"));
            tasks.add(Task.incomplete("Milk"));

            TodoList todoList = new TodoList("Shopping List", tasks);

            todoListRepository.insert(todoList);
        }
    }
}
