package com.kevinthelago.fancy_todo.dao;

import java.util.UUID;

public class TodoType {
    private UUID id;
    private String type;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
