package edu.escuelaing.ieti.task.controllers;

import edu.escuelaing.ieti.task.entities.User;
import edu.escuelaing.ieti.task.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getusers")
    public List<User> getUsers(){
        return userService.getAll();
    }
}
