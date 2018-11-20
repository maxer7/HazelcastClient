package com.epam.demo.step3;

import com.epam.topic.News;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.ITopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class TopicDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicDemo.class);

    public void show(ITopic<News> topic) {
        Stream.iterate(0, i -> ++i)
            .forEach(i -> {
                topic.publish(new News("Test description " + i, "Facebook"));
                LOGGER.info("Publishing message....");
                ThreadUtils.sleepUnsafe(1000);
            });
    }

}
