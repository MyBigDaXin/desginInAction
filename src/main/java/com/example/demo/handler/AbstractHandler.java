package com.example.demo.handler;

import com.example.demo.pojo.OrderDto;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */

public abstract class AbstractHandler {
    public abstract String handler(OrderDto dto);

}
