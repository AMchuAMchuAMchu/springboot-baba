package com.itcast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.config
 * Version ==> 1.0
 * CreateTime ==> 2022-12-13 09:35:34
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Data
@ConfigurationProperties(prefix = "server")
public class CFServer {

    private String ipAddr;
    private String name01;
    private String name02;

}
