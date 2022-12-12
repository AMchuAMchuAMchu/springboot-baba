package com.itcast.controller;

import com.itcast.dao.UserDao;
import com.itcast.entity.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 20:02:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping
    public String get(){

        List<User> users = userDao.selectList(null);

        users.forEach(System.out::println);

        return "index";
    }

}
