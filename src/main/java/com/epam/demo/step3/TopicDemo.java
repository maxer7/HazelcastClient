package com.epam.demo.step3;

import com.epam.topic.News;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.ITopic;

import java.util.stream.Stream;

public class TopicDemo {

    public void show(ITopic<News> topic) {
        Stream.iterate(0, i -> ++i)
            .forEach(i -> {
                topic.publish(new News("Test description " + i, "Facebook"));
                ThreadUtils.sleepUnsafe(1000);
            });
    }

}
