package com.blog.cast.services;

import com.blog.cast.repositories.UserRepository;
import com.blog.cast.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
/*
    public Iterable<User> index(){
        return userRepository.findAll();
    }

 */

    public Iterable<User> index() {
        Iterable<User> allUsers = userRepository.findAll();
        return allUsers;
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User show(Long id){
        return userRepository.findById(id).get();
    }

    public User show(String username) { return userRepository.findByUsername(username).get(); }

    public User show(User user){
        return userRepository.save(user);
    }

    public User update(Long id, User updateUser) {
        User originalUser = userRepository.findById(id).get();
      //  originalUser.setUserBlogEntrys(updateUser.getUserBlogEntrys());
        return userRepository.save(originalUser);
    }

    public Boolean delete(Long id){
        userRepository.deleteById(id);
        return true;
    }

//    public Iterable<Blog> follow(Long id, Blog blog) {
//        User user = userRepository.findById(id).get();
//        user.getFollowing().add(blog);
//        return user.getFollowing();
//    }
}
