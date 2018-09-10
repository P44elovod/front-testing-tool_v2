package com.p44elovod.fronttestingtool.services;

import com.p44elovod.fronttestingtool.models.Testing;
import com.p44elovod.fronttestingtool.repositories.TestingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TestingServiceImp implements TestingService {

    private TestingRepository testingRepository;

    public TestingServiceImp(TestingRepository testingRepository) {
        this.testingRepository = testingRepository;
    }

    @Override
    public List<Testing> getTestingList() {

        ArrayList<Testing> testings = new ArrayList<>();

        testingRepository.findAll().forEach(testings::add);

        log.info("" + testings);

        return testings;
    }
}
