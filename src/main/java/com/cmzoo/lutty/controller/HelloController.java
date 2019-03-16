package com.cmzoo.lutty.controller;

import com.cmzoo.lutty.bean.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Aythor caimin
 * @Date 2019/3/10 14:39
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @Autowired
    private Girl girl;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String say(){
        return "亲爱的"+girl.getName()+"同学，"+"虽然你的年纪现在只有"+girl.getAge()+"岁，但是你的罩杯是"+girl.getCupSize();
    }

}
