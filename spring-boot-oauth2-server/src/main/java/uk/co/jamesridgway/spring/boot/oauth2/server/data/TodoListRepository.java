package uk.co.jamesridgway.spring.boot.oauth2.server.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoListRepository extends MongoRepository<TodoList, String> {
}
