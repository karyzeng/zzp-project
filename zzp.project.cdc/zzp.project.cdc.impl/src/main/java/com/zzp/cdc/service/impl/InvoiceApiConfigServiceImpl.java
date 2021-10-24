package com.zzp.cdc.service.impl;

import com.zzp.cdc.entity.InvoiceApiConfig;
import com.zzp.cdc.mapper.InvoiceApiConfigMapper;
import com.zzp.cdc.service.IInvoiceApiConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 开票客户端API配置 服务实现类
 * </p>
 *
 * @author GaryZeng
 * @since 2021-10-24
 */
@Service
public class InvoiceApiConfigServiceImpl extends ServiceImpl<InvoiceApiConfigMapper, InvoiceApiConfig> implements IInvoiceApiConfigService {

}
