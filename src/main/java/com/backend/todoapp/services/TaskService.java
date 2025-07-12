package com.backend.todoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.todoapp.models.Task;
import com.backend.todoapp.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Task insertTask(Task Task) {
        return repository.save(Task);
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public void deleteTask(Long id) {
        Task task = repository.findById(id).orElseThrow();
        repository.delete(task);
    }

    public Task getTaskById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Task updateTaskById(Long id, Task task) {
        Task toUpdate = repository.findById(id).orElseThrow();
        toUpdate.setIsDone(task.getIsDone());
        toUpdate.setDoneDateTime(task.getDoneDateTime());
        toUpdate.setDescription(task.getDescription());
        return repository.save(toUpdate);
    }
}
