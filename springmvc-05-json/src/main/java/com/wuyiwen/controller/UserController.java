package com.wuyiwen.controller;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuyiwen.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {


        ObjectMapper mapper = new ObjectMapper();


        User user = new User("wuyiwen", 1, "nan");

        String s = mapper.writeValueAsString(user);

        return s;
    }


    @ResponseBody
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {


        ObjectMapper mapper = new ObjectMapper();

        ArrayList<User> users = new ArrayList<User>();


        User user = new User("wuyiwen", 1, "nan");
        User user2 = new User("rwqer", 13, "nan");
        User user3 = new User("ere", 14123, "nan");

        users.add(user);
        users.add(user2);
        users.add(user3);

        String s = mapper.writeValueAsString(users);

        return s;
    }

    @ResponseBody
    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {




        ArrayList<User> users = new ArrayList<User>();


        User user = new User("wuyiwen", 1, "nan");
        User user2 = new User("rwqer", 13, "nan");
        User user3 = new User("ere", 14123, "nan");

        users.add(user);
        users.add(user2);
        users.add(user3);

        String s = JSON.toJSONString(users);

        return s;
    }
}
