package com.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-12-13 05:59:43
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/")
@Controller
public class RiddleJokerController {

    @GetMapping("/user")
    public String user(){

        return "demo";

    }


}
