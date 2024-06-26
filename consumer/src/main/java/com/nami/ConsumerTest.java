package com.nami;

import com.nami.rpc.config.RpcConfig;
import com.nami.rpc.utils.ConfigUtils;

/**
 * @author nami404
 * * @date 2024/6/26 22:15
 */
public class ConsumerTest {
    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
