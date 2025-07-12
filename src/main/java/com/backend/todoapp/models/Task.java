package com.backend.todoapp.models;

import java.time.LocalDateTime;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_notes")
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Nonnull
    private String name;
    @Nonnull
    private String description;
    @Nonnull
    private Boolean isDone;
    @Nonnull
    private LocalDateTime creationDateTime;
    @Nullable
    private LocalDateTime doneDateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public LocalDateTime getDoneDateTime() {
        return doneDateTime;
    }

    public void setDoneDateTime(LocalDateTime doneDateTime) {
        this.doneDateTime = doneDateTime;
    }

    public Task(String name, String description) {
        this.creationDateTime = LocalDateTime.now(); 
        this.isDone = false;
    }

    public Task() {
        this.creationDateTime = LocalDateTime.now(); 
        this.isDone = false;
    }

    public Task(Long id, String name, String description, Boolean isDone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isDone = isDone;
        this.creationDateTime = LocalDateTime.now(); 
        this.doneDateTime = null;
    }

    public Task(Long id, String name, String description, Boolean isDone, 
        LocalDateTime creationDoneTime, LocalDateTime doneDateTime) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.isDone = true;
            this.creationDateTime = creationDoneTime;
            this.doneDateTime = doneDateTime;
    }
}