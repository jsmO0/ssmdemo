package com.shuming;

import com.shuming.pojo.User;
import com.shuming.service.UserService;
import com.shuming.service.UserServiceImpl;

public class App {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        User user = userService.get(1);
        System.out.println(user);
    }
}
