package com.p44elovod.fronttestingtool.repositories;

import com.p44elovod.fronttestingtool.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
