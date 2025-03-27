package com.backend.todoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.todoapp.models.Note;
import com.backend.todoapp.services.NoteService;

@RestController
@CrossOrigin
@RequestMapping(name = "/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping(name = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @PostMapping(name = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Note addNote(@RequestBody Note note) {
        return noteService.insertNote(note);
    }

    @DeleteMapping(name = "/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }
}
