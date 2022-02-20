package com.zzp.cdc.factory;

import com.zzp.cdc.clients.InvoiceClient;
import com.zzp.cdc.entity.InvoiceApiConfig;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description 开票客户端工厂类
 * @Author Garyzeng
 * @since 2021.10.26
 **/
@Slf4j
public class InvoiceClientFactory {

    /**
     * 生产客户端
     *
     * @param config 开票API配置
     * @return {@link InvoiceClient}
     */
    public static InvoiceClient makeClient(InvoiceApiConfig config) {

        if (config == null) {
            return null;
        }

        String prefix = config.getSystemName(); // 开票系统的名称作为客户端类的前缀
        String clientClassName = prefix + "InvoiceClient";
        InvoiceClient client = null;
        try {
            client = (InvoiceClient) Class.forName(clientClassName).newInstance();
        } catch (ClassNotFoundException e) {
            log.error("makeClient -> ClassNotFoundException is " + clientClassName);
        } catch (Exception e) {
            log.error("makeClient -> error is ", e);
        }

        return client;
    }

}
