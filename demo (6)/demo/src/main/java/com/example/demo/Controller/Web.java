package com.example.demo.Controller;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class Web {
    @Autowired
    private HomeService service;

    @RequestMapping("/Nav")
    public String nav(){
        return "Nav";
    }
    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }
    /*
    @RequestMapping("/listall")
    public String listall(){
        return "listall";
    }

     */
    @RequestMapping("/Content")
    public String con()
    {
        return "Content";
    }

    @RequestMapping("/save")
    public String saveData(User user){
        service.saveDetails(user);
        return "home";
    }
    @RequestMapping("/listal")
    public String list(Model model) {
        List<User> listobj = service.listshow();
        model.addAttribute("users", listobj);
        return "listal";

    }
    @RequestMapping("/delete/{id}")
    public String deleteid(@PathVariable int id, Model model)
        {
            service.deleteuser(id);
            List<User>listobj=service.listshow();
            model.addAttribute("users",listobj);
            return "listal";
        }
    @RequestMapping("/update/{id}")
    public String updateid(@PathVariable ("id") int id,Model model)
    {
        User z = service.updateid(id);
        model.addAttribute("user",z);
        return "update";

    }

    @RequestMapping("/saveUpdate")
    public String savedata(User user,Model model)
    {
        service.saveDetails(user);

        List<User>listobj=service.listshow();
        model.addAttribute("users",listobj);
        return "listal";
    }


    }

