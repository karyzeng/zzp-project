package com.zzp.cdc.clients;

import com.zzp.cdc.vo.InvoiceBillHeadVO;
import com.zzp.cdc.vo.InvoiceInfoHeadVO;
import com.zzp.spring.base.results.Result;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Description 万鸿开票客户端
 * @Author Garyzeng
 * @since 2021.10.26
 **/
@Slf4j
public class WangHongInvoiceClient implements InvoiceClient{

    @Override
    public Result<String> pushInvoiceBills(List<InvoiceBillHeadVO> bills) {
        log.info("推送报关单数据到万鸿客户端");
        return null;
    }

    @Override
    public Result<List<InvoiceInfoHeadVO>> listInvoiceInfos(List<String> qpCustomCodes) {
        return null;
    }
}
