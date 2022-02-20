package com.zzp.cdc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description 发票信息vo
 * @Author zzp
 * @since 2021.08.26
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class InvoiceInfoHeadVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发票代码
     */
    private String code;

    /**
     * 发票号码
     */
    private String number;

    /**
     * 代码+号码
     */
    private String codeNumber;

    /**
     * 开票日期
     */
    private Date invoiceDate;

    /**
     * 开票含税金额
     */
    private BigDecimal totalMoney;

    /**
     * 开票税额
     */
    private BigDecimal totalTax;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 发票类型
     */
    private Integer type;

    /**
     * 电子发票票PDF的URL
     */
    private String pdfFile;

    /**
     * 发票详情列表
     */
    private List<InvoiceInfoDetailVO> details;
}
