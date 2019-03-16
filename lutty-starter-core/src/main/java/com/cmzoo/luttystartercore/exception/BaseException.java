package com.cmzoo.luttystartercore.exception;

/**
 * @ClassName BaseException
 * @Description 基础异常类
 * @Aythor caimin
 * @Date 2019/3/10 18:46
 * @Version 1.0
 **/
public class BaseException extends RuntimeException{
    private static final long serialVersionUID = -997101946070796354L;

    /**
     * 错误编码
     */
    protected String code;

    public BaseException() {}

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
