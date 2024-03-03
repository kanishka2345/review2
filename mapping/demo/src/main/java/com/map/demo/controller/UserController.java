package com.map.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.map.demo.model.User;
import com.map.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        return userService.postUser(user);
    }

    @GetMapping("/getlist")
    public java.util.List<User> getList() {
        return userService.getAll();
    }

    @GetMapping("/getlist/{id}")
    public User getById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getlist/page")
    public Page<User> getListWithPagination(Pageable pageable) {
        return userService.getAllWithPagination(pageable);
    }
}
