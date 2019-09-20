package com.example.demo.handler;

import com.example.demo.announ.HandlerType;
import com.example.demo.pojo.OrderDto;
import org.springframework.stereotype.Component;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */

@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {


    @Override
    public String handler(OrderDto dto) {
        return "处理团购订单";
    }
}
