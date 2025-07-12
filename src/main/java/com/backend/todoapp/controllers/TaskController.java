package com.backend.todoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.todoapp.models.Task;
import com.backend.todoapp.services.TaskService;

@RestController
@CrossOrigin
@RequestMapping(name = "/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(name = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping(name = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        return new ResponseEntity<>(taskService.insertTask(task), HttpStatus.OK);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return new ResponseEntity<Task>(taskService.getTaskById(id), HttpStatus.OK);
    }

    @PatchMapping(name = "/{id}")
    public ResponseEntity<Task> updateTaskById(@PathVariable Long id, @RequestBody Task task) {
        return new ResponseEntity<Task>(task, HttpStatus.OK);
    }

    @DeleteMapping(name = "/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }
}
