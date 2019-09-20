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
@HandlerType("3")
public class PromotionHandler extends AbstractHandler{

    @Override
    public String handler(OrderDto dto) {
        return "处理促销订单";
    }
}
