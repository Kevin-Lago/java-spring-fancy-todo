package com.kevinthelago.fancy_todo.controller;

import com.kevinthelago.fancy_todo.dao.Todo;
import com.kevinthelago.fancy_todo.dao.TodoType;
import com.kevinthelago.fancy_todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    TodoService service;

    @PostMapping
    public ResponseEntity<Todo> postTodo(
            @RequestBody Todo todo
    ) {
        return new ResponseEntity<>(service.createTodo(todo), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos() {
        return new ResponseEntity<>(service.readTodo(), HttpStatus.OK);
    }

    @GetMapping("/uuid")
    public ResponseEntity<Todo> getTodo(
            @RequestParam("uuid") UUID uuid
    ) {
        return new ResponseEntity<>(service.readTodo(uuid), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Todo> updateTodo(
            @RequestBody Todo todo
    ) {
        return new ResponseEntity<>(service.updateTodo(todo), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Todo> deleteTodo(
            @RequestParam("uuid") UUID uuid
    ) {
        return new ResponseEntity<>(service.deleteTodo(uuid), HttpStatus.OK);
    }

    @PostMapping("/type")
    public ResponseEntity<TodoType> createTodoType(
            @RequestBody TodoType todoType
    ) {
        return new ResponseEntity<>(service.createTodoType(todoType), HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<TodoType>> getTodoTypes() {
        return new ResponseEntity<>(service.readTodoType(), HttpStatus.OK);
    }

    @GetMapping("/type/{id}")
    public ResponseEntity<TodoType> getTodoType(
            @RequestParam("uuid") UUID uuid
    ) {
        return new ResponseEntity<>(service.readTodoType(uuid), HttpStatus.OK);
    }

    @PutMapping("/type")
    public ResponseEntity<TodoType> updateTodoType(
            @RequestBody TodoType todoType
    ) {
        return new ResponseEntity<>(service.updateTodoType(todoType), HttpStatus.OK);
    }

    @DeleteMapping("/type")
    public ResponseEntity<TodoType> deleteTodoType(
            @RequestParam("uuid") UUID uuid
    ) {
        return new ResponseEntity<>(service.deleteTodoType(uuid), HttpStatus.OK);
    }
}
