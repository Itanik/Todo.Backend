package me.itanik.todo.backend.model.repository;

import me.itanik.todo.backend.model.entity.NoteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NoteRepository extends CrudRepository<NoteEntity, UUID> {
}
