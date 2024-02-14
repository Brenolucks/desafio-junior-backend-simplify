package com.example.desafiosimplify.controller;

import com.example.desafiosimplify.domain.mapper.TodoMapper;
import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.request.TodoDtoRequest;
import com.example.desafiosimplify.dto.response.TodoDtoResponse;
import com.example.desafiosimplify.repository.TodoRepository;
import com.example.desafiosimplify.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
    private final TodoService todoService;

    private TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo")
    public ResponseEntity<TodoDtoResponse> createTodo(@RequestBody @Valid TodoDtoRequest todoDtoRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.createTodo(todoDtoRequest));
    }

    @GetMapping
    public List<Todo> listAllTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(todoService.listAllTodos()).getBody();
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Optional<Todo>> listTodo(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(todoService.listTodo(id));
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(todoService.updateTodo(todo, id));
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
    }
}
