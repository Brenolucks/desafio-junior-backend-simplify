package com.example.desafiosimplify.service.impl;

import com.example.desafiosimplify.domain.mapper.TodoMapper;
import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.request.TodoDtoRequest;
import com.example.desafiosimplify.dto.response.TodoDtoResponse;
import com.example.desafiosimplify.repository.TodoRepository;
import com.example.desafiosimplify.service.TodoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
    private final TodoMapper todoMapper;

    private TodoServiceImpl(TodoRepository todoRepository, TodoMapper todoMapper) {
        this.todoRepository = todoRepository;
        this.todoMapper = todoMapper;
    }

    @Override
    public TodoDtoResponse createTodo(TodoDtoRequest todoDtoRequest) {
        return todoMapper.toTodoDtoResponse(todoRepository.save(todoMapper.toTodo(todoDtoRequest)));
    }
    @Override
    public List<Todo> listAllTodos() {
        return todoRepository.findAll();
    }
    @Override
    public Todo updateTodo(Todo todo, Long id) {
        Todo todoCheck = todoRepository.findById(id).get();
        todoCheck.setName(todo.getName());
        todoCheck.setAccomplished(todo.isAccomplished());
        todoCheck.setDescription(todo.getDescription());
        todoCheck.setPriority(todo.getPriority());
        return todoRepository.save(todoCheck);
    }
    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
    @Override
    public Optional<Todo> listTodo(Long id){
        return Optional.ofNullable(todoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não existe Todo com este id: " + id)));
    }
}
