package com.zzp.cdc.controller;


import com.zzp.cdc.entity.InvoiceApiConfig;
import com.zzp.cdc.service.IInvoiceApiConfigService;
import com.zzp.spring.base.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 开票客户端API配置 前端控制器
 * </p>
 *
 * @author GaryZeng
 * @since 2021-10-24
 */
@RestController
@RequestMapping("/cdc/invoice-api-config")
public class InvoiceApiConfigController {

    @Autowired
    private IInvoiceApiConfigService invoiceApiConfigService;

    @ResponseBody
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Result<InvoiceApiConfig> getConfig(@RequestParam(value = "id") Integer id) {
        InvoiceApiConfig invoiceApiConfig = invoiceApiConfigService.getById(id);
        return Result.ok("查询成功", invoiceApiConfig);
    }

}
