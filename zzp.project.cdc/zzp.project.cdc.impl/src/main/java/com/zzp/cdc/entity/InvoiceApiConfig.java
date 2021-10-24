package com.zzp.cdc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 开票客户端API配置
 * </p>
 *
 * @author GaryZeng
 * @since 2021-10-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_invoice_api_config")
public class InvoiceApiConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 开票系统
     */
    @TableField("SYSTEM")
    private String system;

    /**
     * 开票系统API URL
     */
    @TableField("URL")
    private String url;

    /**
     * 开票系统公钥
     */
    @TableField("PUBLIC_KEY")
    private String publicKey;

    /**
     * 开票系统私钥
     */
    @TableField("PRIVATE_KEY")
    private String privateKey;

    /**
     * 企业UID
     */
    @TableField("COMPANY_UID")
    private String companyUid;


}
