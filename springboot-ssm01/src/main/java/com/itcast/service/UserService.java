package com.itcast.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.service
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 20:00:54
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface UserService extends IService<User> {
}
