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
public class Head {
    private Integer storeId;
    private String storeTitle;
    private String storeCode;
    private String contactName;
    private String contactTel;
    private String contactAddr;
    private String beginDate;
    private String endDate;
    private BigDecimal allMoney;
    private Integer allNum;
    private String billMaker;
    private String auditor;
    private String billDate;
}