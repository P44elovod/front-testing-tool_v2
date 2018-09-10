package com.p44elovod.fronttestingtool.bootstrap;

import com.p44elovod.fronttestingtool.models.Device;
import com.p44elovod.fronttestingtool.models.Testing;
import com.p44elovod.fronttestingtool.models.User;
import com.p44elovod.fronttestingtool.repositories.DeviceRepository;
import com.p44elovod.fronttestingtool.repositories.TestingRepository;
import com.p44elovod.fronttestingtool.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TestingBootstrap implements ApplicationListener<ContextRefreshedEvent> {

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
    public void onApplicationEvent(ContextRefreshedEvent event) {
        testingRepository.saveAll(getTesting());


        log.info("===================засеввало" + getTesting());

    }



    private List<Testing> getTesting() {

        List<Testing> testings = new ArrayList<>();


        User user = new User();
        user.setUserName("user1");
        Device device = new Device();
        device.setDeviceName("Device 1");

        Testing testing = new Testing();
        testing.setUser(user);
        testing.setDevice(device);
        testings.add(testing);


        return testings;
    }


}
