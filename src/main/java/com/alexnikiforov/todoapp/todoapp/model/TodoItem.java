package com.alexnikiforov.todoapp.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    public TodoItem() {
    }

    public TodoItem(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public TodoItem(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
