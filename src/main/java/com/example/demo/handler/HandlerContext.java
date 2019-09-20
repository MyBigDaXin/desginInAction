package com.example.demo.handler;

import com.example.demo.exception.ExceptionCast;
import com.example.demo.response.CommonCode;
import com.example.demo.utils.SpringUtils;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */
public class HandlerContext {

    private Map<String,Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type){
        Class clazz = handlerMap.get(type);
        if(clazz == null){
            ExceptionCast.cast(CommonCode.FAIL);
        }
        return (AbstractHandler)SpringUtils.getBean(clazz);
    }
}
