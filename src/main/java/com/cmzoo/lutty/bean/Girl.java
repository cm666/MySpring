package com.cmzoo.lutty.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName Gril
 * @Description TODO
 * @Aythor caimin
 * @Date 2019/3/10 15:02
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "girl")
public class Girl {
    private String cupSize;
    private String name;
    private int age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
