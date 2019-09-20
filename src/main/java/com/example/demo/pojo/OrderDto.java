package com.example.demo.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lth
 * @version 1.0.0
 * @date
 */
@Data
public class OrderDto {

    private String code;

    private BigDecimal price;

    private String type;

}
