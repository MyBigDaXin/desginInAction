package com.example.demo.controller;

import com.example.demo.pojo.OrderDto;
import com.example.demo.service.IOrderService;
import com.sun.media.jfxmediaimpl.platform.ios.IOSMediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */
@RestController
public class TestController {
    @Autowired
    IOrderService iOrderService;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(@RequestBody OrderDto orderDto){
        return iOrderService.handle(orderDto);
    }
}
