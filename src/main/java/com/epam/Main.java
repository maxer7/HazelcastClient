package com.epam;

import com.epam.config.ConfigProvider;
import com.epam.demo.step1.MapConsumerDemo;
import com.epam.demo.step2.LockDemo;
import com.epam.demo.step3.TopicDemo;
import com.epam.demo.step4.ExecutorDemo;
import com.epam.demo.task.TaskProvider;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient(ConfigProvider.getDefaultClientConfig());

        new MapConsumerDemo().show(hazelcastInstance.getMap("demoMap"));

        new LockDemo().show(hazelcastInstance.getLock("demoLock"));

        new TopicDemo().show(hazelcastInstance.getTopic("demoTopic"));

        new ExecutorDemo().show(hazelcastInstance.getExecutorService("demoExecutor"));

        new TaskProvider().provide(hazelcastInstance.getQueue("demoQueue"));
    }

}

