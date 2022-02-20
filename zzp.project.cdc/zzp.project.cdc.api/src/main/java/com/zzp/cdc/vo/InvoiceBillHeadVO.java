package com.zzp.cdc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 报关单发票表头信息Vo
 * @Author zzp
 * @since 2021.08.27
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class InvoiceBillHeadVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 报关单类型，1为保税，2为非保税
     */
    private Integer type;
    /**
     * 报关单号
     */
    private String qpCustomCode;

    /**
     * 收发货人名称
     */
    private String sendReceiveCompanyName;

    /**
     * 收发货人信用代码
     */
    private String sendReceiveCompanyCreditCode;

    /**
     * 合同协议号
     */
    private String contractNo;

    /**
     * 监管方式代码
     */
    private String regulateWayCode;

    /**
     * 监管方式名称
     */
    private String regulateWayName;

    /**
     * 运输工具名称
     */
    private String transportTool;

    /**
     * 成交方式编号
     */
    private String buyWayCode;

    /**
     * 成交方式名称
     */
    private String buyWayName;

    /**
     * 装货港/指运港code
     */
    private String loadPlaceCode;

    /**
     * 经停港/指运港名称
     */
    private String loadPlaceName;

    /**
     * 表体列表
     */
    private List<InvoiceBillDetailVO> detailVos;

}
