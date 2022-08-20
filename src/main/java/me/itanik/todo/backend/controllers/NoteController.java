package me.itanik.todo.backend.controllers;

import me.itanik.todo.backend.model.dto.TodoNote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NoteController {

    @GetMapping("/note")
    public List<TodoNote> getNote(@RequestParam(value = "userId") String userId) {
        return new ArrayList<>();
    }
}
