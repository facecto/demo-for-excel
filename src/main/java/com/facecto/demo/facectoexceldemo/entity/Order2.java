package com.facecto.demo.facectoexceldemo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author Jon So, https://cto.pub, https://github.com/facecto
 * @version v1.0.0 (2021/12/03)
 */
@Data
@Accessors(chain = true)
public class Order2 {
    private String orderNo;
    private String custName;
    private String orderDate;
    private String goodTitle;
    private BigDecimal orderMoney;
    private BigDecimal goodPrice;
    private Integer goodNum;
}
