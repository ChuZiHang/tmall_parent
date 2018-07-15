package com.aopioc.tmall.base.baseException;

import com.aopioc.tmall.entity.Result;
import com.aopioc.tmall.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * author by JefferyChang on  2018/7/18
 */
@ControllerAdvice
public class BaseExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return  new Result(false, StatusCode.ERROR, e.getMessage());
    }


}
