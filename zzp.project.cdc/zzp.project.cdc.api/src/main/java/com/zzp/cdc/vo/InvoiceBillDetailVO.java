package com.zzp.cdc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description 报关单发票表体信息Vo
 * @Author zzp
 * @since 2021.08.30
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class InvoiceBillDetailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 序号
     */
    private Integer lineNum;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 成交单位名称
     */
    private String unitName;

    /**
     * 成交数量
     */
    private BigDecimal num;

    /**
     * 成交单价
     */
    private BigDecimal singlePrice;

    /**
     * 成交总价
     */
    private BigDecimal totalPrice;

    /**
     * 币制code
     */
    private String moneyTypeCode;

    /**
     * 币制名称
     */
    private String moneyTypeName;
}
