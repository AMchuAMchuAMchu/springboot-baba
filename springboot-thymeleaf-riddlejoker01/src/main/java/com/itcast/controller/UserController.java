package com.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 20:02:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/")
@Controller
public class UserController {

    @GetMapping("/demo")
    public String user(Model model){
        System.out.println("访问:"+ LocalDateTime.now());
        model.addAttribute("name","shion");
        return "demo";
    }

}
