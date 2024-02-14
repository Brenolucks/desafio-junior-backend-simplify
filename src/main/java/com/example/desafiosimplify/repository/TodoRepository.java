package com.example.desafiosimplify.repository;

import com.example.desafiosimplify.domain.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long> { }
