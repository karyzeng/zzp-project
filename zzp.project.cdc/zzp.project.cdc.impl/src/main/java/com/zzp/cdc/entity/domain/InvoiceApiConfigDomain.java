package com.zzp.cdc.entity.domain;

import com.zzp.cdc.entity.InvoiceApiConfig;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 开票客户端API配置 领域类
 * </p>
 *
 * @author GaryZeng
 * @since 2021-10-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Component
public class InvoiceApiConfigDomain extends InvoiceApiConfig implements Serializable {

     private static final long serialVersionUID = 1L;

}
