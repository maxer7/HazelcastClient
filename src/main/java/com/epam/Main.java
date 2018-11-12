package com.epam;

import com.epam.config.ConfigProvider;
import com.epam.event.EventImpl2;
import com.epam.util.ThreadUtils;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // 2 step consume map
        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient(ConfigProvider.getDefaultClientConfig());
//        IMap<Long, Long> testMap = hazelcastInstance.getMap("demoMap");
//        new DataConsumer().consume(testMap);
//
//        // 4 step consume again
//        new DataConsumer().consume(testMap);
//
//        // 5 lock
//        Stream.iterate(0, i -> ++i)
//            .forEach(i -> {
//                LOGGER.info("Trying to lock...");
//                ILock lock = hazelcastInstance.getLock("demoLock");
//                try {
//                    LOGGER.info("Lock is acquired. Process hard logic...");
//                    ThreadUtils.sleepUnsafe(5000);
//                } finally {
//                    LOGGER.info("Releasing lock...");
//                    lock.unlock();
//                }
//            });
//
//
//        // 7 publish messages
//        Stream.iterate(0, i -> ++i)
//            .forEach(i -> {
//                hazelcastInstance.getTopic("demoTopic")
//                    .publish(new News("Test description " + i, "Facebook"));
//                ThreadUtils.sleepUnsafe(1000);
//            });


//        // 9 submit task to executors
//        Stream.iterate(0, i -> ++i)
//            .forEach(i -> {
//                LOGGER.info("Submitting task {}", i);
//                hazelcastInstance.getExecutorService("demoExecutor").execute(new SumTask(i, i , i+1));
//                ThreadUtils.sleepUnsafe(100);
//            });


//        // 10 add events
//        while (true) {
//            ThreadUtils.sleepUnsafe(2000);
//            LOGGER.info("Pushing event to queue...");
//            hazelcastInstance.getQueue("demoQueue").add(new EventImpl2());
//        }
    }

}

