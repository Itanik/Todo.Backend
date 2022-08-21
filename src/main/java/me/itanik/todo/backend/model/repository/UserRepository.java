package me.itanik.todo.backend.model.repository;

import me.itanik.todo.backend.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
