package com.example.demo.intercptor;


import com.example.demo.announ.HandlerType;
import com.example.demo.handler.HandlerContext;
import com.example.demo.utils.ClassScaner;
import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */
@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE = "com.example.demo.handler";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        HashMap<String, Class> handleMap = Maps.newHashMapWithExpectedSize(3);
        ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz ->{
            String type = clazz.getAnnotation(HandlerType.class).value();
            handleMap.put(type,clazz);
        });
        // 初始化handlerContext 注册到spring容器
        HandlerContext handlerContext = new HandlerContext(handleMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(),handlerContext);
    }
}
