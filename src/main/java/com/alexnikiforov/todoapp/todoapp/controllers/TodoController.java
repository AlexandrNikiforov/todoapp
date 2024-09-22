package com.alexnikiforov.todoapp.todoapp.controllers;

import com.alexnikiforov.todoapp.todoapp.model.TodoItem;
import com.alexnikiforov.todoapp.todoapp.repositories.TodoItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TodoController implements CommandLineRunner {

    private final TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping
    public String index(Model model) {
        List<TodoItem> allTodos = todoItemRepository.findAll();
        model.addAttribute("todoItems", allTodos);
        return "index";
    }

    @Override
    public void run(String... args) throws Exception {
//        Это код с сохранение нескольких "задач" для демонстрации
//        В дальнейшем он будет удален
        todoItemRepository.save(new TodoItem("Дэмо задача 1"));
        todoItemRepository.save(new TodoItem("Дэмо задача 2"));
//        конец секции с временным кодом
    }
}
