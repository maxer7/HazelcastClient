package com.epam;

import com.epam.config.ConfigProvider;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient(ConfigProvider.getDefaultClientConfig());

    }

}