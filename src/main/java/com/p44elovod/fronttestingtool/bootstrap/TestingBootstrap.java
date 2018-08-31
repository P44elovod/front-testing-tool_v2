package com.p44elovod.fronttestingtool.bootstrap;

import com.p44elovod.fronttestingtool.models.Testing;
import com.p44elovod.fronttestingtool.repositories.DeviceRepository;
import com.p44elovod.fronttestingtool.repositories.TestingRepository;
import com.p44elovod.fronttestingtool.repositories.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class TestingBootstrap implements ApplicationListener<ContextClosedEvent> {

    private final DeviceRepository deviceRepository;
    private final UserRepository userRepository;
    private final TestingRepository testingRepository;

    public TestingBootstrap(DeviceRepository deviceRepository, UserRepository userRepository, TestingRepository testingRepository) {
        this.deviceRepository = deviceRepository;
        this.userRepository = userRepository;
        this.testingRepository = testingRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        testingRepository.saveAll((getTesting()));

    }

    private List<Testing> getTesting() {

        List<Testing> testings = new ArrayList<>();




        return testings;
    }
}
