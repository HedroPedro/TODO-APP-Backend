package com.backend.todoapp.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.todoapp.models.Note;

@Repository
public interface NoteRepository extends ListCrudRepository<Note, Integer>{
    
}
