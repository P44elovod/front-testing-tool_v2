package com.p44elovod.fronttestingtool.services;

import com.p44elovod.fronttestingtool.models.User;
import com.p44elovod.fronttestingtool.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();

        userRepository.findAll().forEach(userList::add);

        return userList;
    }
}
