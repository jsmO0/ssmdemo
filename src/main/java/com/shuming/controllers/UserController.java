package com.shuming.controllers;

import com.shuming.pojo.User;
import com.shuming.service.UserService;
import com.shuming.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/User")
public class UserController {

    @RequestMapping("/login.do")
    public String listUser(HttpSession session, String username, String password){
        System.out.println(username+":" + password);
        session.setAttribute("username",username);
        UserService userService = new UserServiceImpl();
        //首先验证用户名是否存在
        if (userService.getAllUsername().contains(username)){
              if (userService.getPassword(username).equals(password)){
                  System.out.println("经过了数据库的验证");
                  return "welcome";
              }
        }
        return null;
    }
}
