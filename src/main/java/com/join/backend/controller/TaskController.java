package com.join.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public List<String> getAllTasks() {
        return List.of("Task 1", "Task 2", "Task 3");
    }

    @PostMapping
    public String createTask() {
        return "Task created!";
    }
}
