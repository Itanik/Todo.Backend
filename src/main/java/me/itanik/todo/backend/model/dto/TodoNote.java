package me.itanik.todo.backend.model.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record TodoNote(UUID userId, UUID id, String title, String details, long updateCount, LocalDateTime creationDate,
                       LocalDateTime modificationDate) {
}