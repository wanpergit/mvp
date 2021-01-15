package com.sky.consumer.user.controller;

import com.sky.util.RespCode;
import com.sky.util.RespResult;
import exception.BaseMvpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @Author: Ningxb
 * @Date: 2021-01-14 11:21
 * @description: ${description}
 */
@ControllerAdvice
public class MyGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @ExceptionHandler({Exception.class,RuntimeException.class})
    @ResponseBody
    public RespResult doHandler(Exception e){
        RespResult err=null;
        if(e instanceof BaseMvpException){
            BaseMvpException me = (BaseMvpException)e;
            err = RespResult.error(me.getErrorMessage());
            logger.error("【BIZ-ERROR】---------【"+err.getCode()+"】---【"+err.getMessage()+"】");
            //System.out.printf("-------------------------[err:]"+err+"-------------------------");
        }else{
            e.printStackTrace();
            err = RespResult.secByError(RespCode.SYSTEM_ERROR.getCode(),e.getMessage());
            logger.error("【SYS-ERROR】---------【"+err.getCode()+"】---【"+err.getMessage()+"】");
            //System.out.printf("-------------------------[sys_err:]"+err+"-------------------------");
        }
        return err;
    }
}
