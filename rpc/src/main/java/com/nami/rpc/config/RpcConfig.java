package com.nami.rpc.config;

import lombok.Data;

/**
 * RPC 框架配置
 * @author nami404
 * * @date 2024/6/26 21:24
 */
@Data
public class RpcConfig {
    /**
     * 名称
     */
    private String name = "nami404";

    /**
     * 版本
     */
    private String version = "1.0";

    /**
     * 服务器主机名
     */
    private String serverHost = "localhost";

    /**
     * 服务器端口号
     */
    private Integer serverPort = 8080;

    /**
     * 模拟调用
     */
    private boolean mock = false;
}
