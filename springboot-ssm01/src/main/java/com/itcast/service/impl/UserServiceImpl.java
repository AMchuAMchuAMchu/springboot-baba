package com.itcast.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itcast.dao.UserDao;
import com.itcast.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot-baba
 * BelongsPackage ==> com.itcast.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 20:01:25
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
