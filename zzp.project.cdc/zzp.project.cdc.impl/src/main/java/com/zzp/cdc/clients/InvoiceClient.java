package com.zzp.cdc.clients;

import com.zzp.cdc.vo.InvoiceBillHeadVO;
import com.zzp.cdc.vo.InvoiceInfoHeadVO;
import com.zzp.spring.base.results.Result;

import java.util.List;

/**
 * @Description 开票客户端接口
 * @Author Garyzeng
 * @since 2021.10.25
 **/
public interface InvoiceClient {

    /**
     * 推送报关单发票数据
     *
     * @param bills      报关单发票信息列表
     * @return {@link Result <String>}
     */
    Result<String> pushInvoiceBills(List<InvoiceBillHeadVO> bills);

    /**
     * 获取发票信息
     *
     * @param qpCustomCodes 报关单号列表
     * @return {@link Result< List <InvoiceInfoHeadVO>>}
     */
    Result<List<InvoiceInfoHeadVO>> listInvoiceInfos(List<String> qpCustomCodes);

}
