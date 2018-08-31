package com.p44elovod.fronttestingtool.repositories;

import com.p44elovod.fronttestingtool.models.Device;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DeviceRepository extends CrudRepository<Device, Long> {

    Optional<Device> findById(Long id);

}
