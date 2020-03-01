package com.fixaslab.test.service;

import com.fixaslab.test.entity.User;
import com.fixaslab.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return this.userRepository.save(user);
    }

    public User getUser(int id){
        return this.userRepository.findById(id).get();
    }

    public void updateUser(User user){
        this.userRepository.save(user);
    }

    public void deleteUser(int id){
        this.userRepository.deleteById(id);
        return;
    }
}
