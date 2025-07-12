package com.backend.todoapp.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.todoapp.models.Task;

@Repository
public interface TaskRepository extends ListCrudRepository<Task, Long>{
    
}
