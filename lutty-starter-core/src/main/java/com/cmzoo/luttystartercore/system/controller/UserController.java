package com.cmzoo.luttystartercore.system.controller;

import com.cmzoo.luttystartercore.base.BaseController;
import com.cmzoo.luttystartercore.base.Result;
import com.cmzoo.luttystartercore.constants.BaseEnums;
import com.cmzoo.luttystartercore.constants.SystemConstants;
import com.cmzoo.luttystartercore.system.dto.User;
import com.cmzoo.luttystartercore.util.Dates;
import com.cmzoo.luttystartercore.util.Results;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Description 用户Controller
 * @Aythor caimin
 * @Date 2019/3/13 20:31
 * @Version 1.0
 **/
@RequestMapping("/sys/user")
@RestController
public class UserController extends BaseController {
    private static List<User> userList = new ArrayList<User>();

    // 先静态模拟数据
    static {
        User user1 = new User();
        user1.setUserId(1L);
        user1.setUsername("lufei");
        user1.setNickname("蒙奇D路飞");
        user1.setBirthday(Dates.parseDate("2000-05-05"));
        user1.setSex(SystemConstants.Sex.MALE);
        user1.setEnabled(SystemConstants.Flag.YES);
        userList.add(user1);

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUsername("nami");
        user2.setNickname("娜美");
        user2.setBirthday(Dates.parseDate("2000/7/3"));
        user2.setSex(SystemConstants.Sex.FEMALE);
        user2.setEnabled(SystemConstants.Flag.YES);
        userList.add(user2);
    }

    @RequestMapping("/queryAll")
    public Result queryAll(){
        return Results.successWithData(userList, BaseEnums.SUCCESS.code(), BaseEnums.SUCCESS.desc());
    }

    @RequestMapping("/queryOne/{userId}")
    public Result queryOne(@PathVariable Long userId){
        User user = null;
        for(User u : userList){
            if(u.getUserId().longValue() == userId){
                user = u;
            }
        }
        return Results.successWithData(user);
    }
}
