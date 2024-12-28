package com.kevinthelago.fancy_todo.service;

import com.kevinthelago.fancy_todo.dao.Todo;
import com.kevinthelago.fancy_todo.dao.TodoType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    public Todo createTodo(Todo todo) {
        return null;
    }

    public List<Todo> readTodo() {
        return null;
    }

    public Todo readTodo(UUID uuid) {
        return null;
    }

    public Todo updateTodo(Todo todo) {
        return null;
    }

    public Todo deleteTodo(UUID uuid) {
        return null;
    }

    public TodoType createTodoType(TodoType todoType) {
        return null;
    }

    public TodoType readTodoType(UUID uuid) {
        return null;
    }

    public List<TodoType> readTodoType() {
        return null;
    }

    public TodoType updateTodoType(TodoType todoType) {
        return null;
    }

    public TodoType deleteTodoType(UUID uuid) {
        return null;
    }
}
