package com.cmzoo.luttystartercore.base;

/**
 * @ClassName BaseEnum
 * @Description 基础枚举接口
 * @Aythor caimin
 * @Date 2019/3/10 18:27
 * @Version 1.0
 **/
public interface BaseEnum<K,V> {
    /**
     * 获取编码
     *
     * @return 编码
     */
    K code();

    /**
     * 获取描述
     *
     * @return 描述
     */
    V desc();

}
