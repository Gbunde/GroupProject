package com.blog.cast.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    //private List<User> followers = new ArrayList();

    //private List<Blog> following = new ArrayList();

    //private List<BlogEntry> userBlogEntries = new ArrayList();

    //private List<DirectMessage> directMessages = new ArrayList();

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
/*
    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<Blog> getFollowing() {
        return following;
    }

    public void setFollowing(List<Blog> following) {
        this.following = following;
    }

    public List<BlogEntry> getUserBlogEntries() {
        return userBlogEntries;
    }

    public void setUserBlogEntries(List<BlogEntry> userBlogEntries) {
        this.userBlogEntries = userBlogEntries;
    }

    public List<DirectMessage> getDirectMessages() {
        return directMessages;
    }

    public void setDirectMessages(List<DirectMessage> directMessages) {
        this.directMessages = directMessages;
    }

 */
}
