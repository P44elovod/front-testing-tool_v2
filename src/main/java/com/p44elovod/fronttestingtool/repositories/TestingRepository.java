package com.p44elovod.fronttestingtool.repositories;

import com.p44elovod.fronttestingtool.models.Testing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TestingRepository extends CrudRepository<Testing, Long> {

}
