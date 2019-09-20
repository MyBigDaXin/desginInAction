package com.example.demo.service.Impl;

import com.example.demo.handler.AbstractHandler;
import com.example.demo.handler.HandlerContext;
import com.example.demo.pojo.OrderDto;
import com.example.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private HandlerContext hanlderContext;

    @Override
    public String handle(OrderDto dto) {
        AbstractHandler handler = hanlderContext.getInstance(dto.getType());
        return handler.handler(dto);
    }
}
