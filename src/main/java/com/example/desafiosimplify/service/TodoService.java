package com.example.desafiosimplify.service;

import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.request.TodoDtoRequest;
import com.example.desafiosimplify.dto.response.TodoDtoResponse;


import java.util.List;
import java.util.Optional;

public interface TodoService {
    TodoDtoResponse createTodo(TodoDtoRequest todoDtoRequest);
    List<Todo> listAllTodos();
    Todo updateTodo(Todo todo, Long id);
    void deleteTodo(Long id);
    Optional<Todo> listTodo(Long id);

}
