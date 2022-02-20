package com.zzp.cdc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description 发票信息详情vo
 * @Author zzp
 * @since 2021.08.26
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class InvoiceInfoDetailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单据编号
     */
    private String billNo;

    /**
     * 序号
     */
    private String index;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 含税金额
     */
    private BigDecimal money;

    /**
     * 不含税金额
     */
    private BigDecimal moneyWithoutTax;

    /**
     * 税额
     */
    private BigDecimal tax;

    /**
     * 扩展字段1
     */
    private String standby1;

    /**
     * 扩展字段2
     */
    private String standby2;

    /**
     * 扩展字段3
     */
    private String standby3;

}
