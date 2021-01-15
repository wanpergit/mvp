package com.sky.exception;

import exception.BaseMvpException;

/**
 * @Author: Ningxb
 * @Date: 2021-01-14 14:47
 * @description: ${description}
 */
public class UserDaoMvpException extends BaseMvpException{
    public UserDaoMvpException(Integer errorCode) {
        super(errorCode);
    }

    public UserDaoMvpException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public UserDaoMvpException(Exception e, Integer errorCode, String errorMessage) {
        super(e, errorCode, errorMessage);
    }

    public UserDaoMvpException(Exception e) {
        super(e);
    }

    public UserDaoMvpException(Exception e, Integer errorCode) {
        super(e, errorCode);
    }
}
