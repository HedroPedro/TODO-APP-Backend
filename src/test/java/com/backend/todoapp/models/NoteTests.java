package com.backend.todoapp.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTests {
    @Test
    public void assertIdEquals() {
        Task note = new Task(0L, "Nome", "Descrição", false);
        assertEquals(0, note.getId());
    }


}
