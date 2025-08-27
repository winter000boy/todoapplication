package com.todoapplication.todoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapplication.todoapplication.model.ToDoItem;
import com.todoapplication.todoapplication.repository.ToDoRepository;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping
    public List<ToDoItem> findAll() {
        return toDoRepository.findAll();
    }

    @PostMapping
    public ToDoItem save(@RequestBody ToDoItem toDoItem) {
        return toDoRepository.save(toDoItem);
    }

    @PutMapping
    public ToDoItem update(@RequestBody ToDoItem toDoItem) {
        return toDoRepository.save(toDoItem);
    }

}
