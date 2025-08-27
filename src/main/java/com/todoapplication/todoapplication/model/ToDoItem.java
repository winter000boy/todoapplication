package com.todoapplication.todoapplication.model;

import jakarta.persistence.Entity;

@Entity

public class ToDoItem {

    private Long id;
    private String title;
    private boolean completed;
}
