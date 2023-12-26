package com.example.demo.Controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Restapi {
     @Autowired
     private HomeService service;
     @Autowired
     private UserRepository repo;
     @PostMapping("/saveapi")
     public String saveapi(@RequestBody User user){
          service.saveap(user);
          return "saved successfully";
     }
     @GetMapping("/listall")
     public List<User> allusers()
     {
          List<User>s=repo.findAll();
          return s;
     }
     @PutMapping("/updateapi")
     public String updateApi(@RequestBody User user)
     {
          HomeService.UpdateUserApi(user);
          return "update success";
     }
     @PutMapping("/deleteapi/{id}")
     public String deleteapi(@PathVariable int id)
     {
          HomeService.deleteuserApi(id);
          return "deleted success";
     }

}
