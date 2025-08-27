package com.todoapplication.todoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapplication.todoapplication.model.ToDoItem;

public interface ToDoRepository extends JpaRepository<ToDoItem, Long> {

}
