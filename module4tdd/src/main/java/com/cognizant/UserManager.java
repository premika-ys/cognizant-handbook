package com.cognizant;

public class UserManager {

    private UserService userService;

    public UserManager(UserService userService) {
        this.userService = userService;
    }

    public String findUser(String id) {
        return userService.getUserName(id);
    }
}