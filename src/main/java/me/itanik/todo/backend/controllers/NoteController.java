package me.itanik.todo.backend.controllers;

import me.itanik.todo.backend.model.entity.NoteEntity;
import me.itanik.todo.backend.model.repository.NoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/note")
    public Iterable<NoteEntity> getNotes(@RequestParam(value = "userId") String userId) {
        final List<UUID> ids = new ArrayList<>();
        ids.add(UUID.fromString(userId));
        return noteRepository.findAllById(ids);
    }
}
