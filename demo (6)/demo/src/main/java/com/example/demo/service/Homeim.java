package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.desktop.UserSessionEvent;
import java.util.List;
import java.util.Optional;

@Service
public class Homeim implements HomeService {
    @Autowired
    private UserRepository rep;
    @Override
    public void saveDetails(User user)
    {
        rep.save(user);
    }

    @Override
    public void saveap(User user) {
        rep.save(user);
    }

    @Override
    public List<User> listshow() {
        List<User>serviceList=rep.findAll();

        return serviceList;
    }

    @Override
    public void deleteuser(int id) {
        rep.deleteById(id);
    }

    @Override
    public User updateid(int id) {
        Optional<User> findById = rep.findById(id);
        User users = findById.get();
        return users;
    }

}



