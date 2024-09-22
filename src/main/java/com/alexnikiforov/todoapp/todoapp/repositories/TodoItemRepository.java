package com.alexnikiforov.todoapp.todoapp.repositories;

import com.alexnikiforov.todoapp.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
