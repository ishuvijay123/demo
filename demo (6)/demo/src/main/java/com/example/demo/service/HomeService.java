package com.example.demo.service;
import com.example.demo.Controller.Web;
import com.example.demo.entity.User;

import java.util.List;

public interface HomeService {


    static void UpdateUserApi(User user) {
    }

    static void deleteuserApi(int id) {
    }

    void saveDetails(User use);


    void saveap(User user);

    List<User> listshow();

    void deleteuser(int id);



    User updateid(int id);

}
