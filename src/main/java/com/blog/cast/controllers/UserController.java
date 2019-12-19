package com.blog.cast.controllers;

import com.blog.cast.models.User;
import com.blog.cast.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public ResponseEntity<Iterable<User>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> show(Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> create(User user) {
        return new ResponseEntity<>(service.create(user), HttpStatus.CREATED);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> update(Long id, User user) {
        return new ResponseEntity<>(service.update(id, user), HttpStatus.OK);
    }


    @DeleteMapping("/user/{id}")
    public ResponseEntity<Boolean> destroy(Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
