package com.example.desafiosimplify.domain.mapper;

import com.example.desafiosimplify.domain.model.Todo;
import com.example.desafiosimplify.dto.request.TodoDtoRequest;
import com.example.desafiosimplify.dto.response.TodoDtoResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TodoMapper {

    Todo toTodo(TodoDtoRequest todoDtoRequest);
    @InheritInverseConfiguration
    TodoDtoResponse toTodoDtoResponse(Todo todo);
}
