package com.itcast.controller;

import com.itcast.config.CFServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
public class RiddleJokerController {

    @Autowired
    private CFServer cfServer;

    @GetMapping("/user")
    public String user(){
        log.info("好了喔!!爱花和真白都是我的!!!!");
        System.out.println(">>"+cfServer);
        return "demo";
    }


}
