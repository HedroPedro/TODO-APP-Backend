package com.backend.todoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.todoapp.models.Note;
import com.backend.todoapp.repositories.NoteRepository;

@Service
public class NoteService {
    @Autowired
    private NoteRepository repository;

    public void insertTask() {}

    public List<Note> getNotes() {
        return repository.findAll();
    }

    public Note insertNote(Note note) {
        return repository.save(note);
    }
}
