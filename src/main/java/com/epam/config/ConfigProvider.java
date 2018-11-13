package com.epam.config;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientUserCodeDeploymentConfig;
import com.hazelcast.config.Config;

public class ConfigProvider {

    public static ClientConfig getDefaultClientConfig() {
        ClientConfig clientConfig = new ClientConfig();
//        enableUserCodeDeployment(clientConfig, "com.epam.task.DivideTask");
        return clientConfig;
    }

    private static void enableUserCodeDeployment(ClientConfig clientConfig, String className) {
        ClientUserCodeDeploymentConfig clientUserCodeDeploymentConfig = new ClientUserCodeDeploymentConfig();
        clientUserCodeDeploymentConfig.addClass(className);
        clientUserCodeDeploymentConfig.setEnabled(true);
        clientConfig.setUserCodeDeploymentConfig(clientUserCodeDeploymentConfig);
    }

}
