package com.sky.exception;

import exception.BaseMvpException;

/**
 * @Author: Ningxb
 * @Date: 2021-01-14 14:50
 * @description: ${description}
 */
public class UserServiceMvpException extends BaseMvpException {
    public UserServiceMvpException(Integer errorCode) {
        super(errorCode);
    }

    public UserServiceMvpException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public UserServiceMvpException(Exception e, Integer errorCode, String errorMessage) {
        super(e, errorCode, errorMessage);
    }

    public UserServiceMvpException(Exception e) {
        super(e);
    }

    public UserServiceMvpException(Exception e, Integer errorCode) {
        super(e, errorCode);
    }
}
