package com.cmzoo.luttystartercore.exception;

/**
 * @ClassName ServiceException
 * @Description Service层异常
 * @Aythor caimin
 * @Date 2019/3/10 18:47
 * @Version 1.0
 **/
public class ServiceException extends BaseException {
    private static final long serialVersionUID = 6058294324031642376L;

    public ServiceException() {}

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String code, String message) {
        super(code, message);
    }
}
