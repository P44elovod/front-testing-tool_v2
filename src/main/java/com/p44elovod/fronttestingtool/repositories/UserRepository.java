package com.p44elovod.fronttestingtool.repositories;

import com.p44elovod.fronttestingtool.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);
}
