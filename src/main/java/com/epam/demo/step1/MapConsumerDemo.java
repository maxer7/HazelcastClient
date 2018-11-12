package com.epam.demo.step1;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class MapConsumerDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(MapConsumerDemo.class);

    public void show(IMap<Long, Long> map) {
        consume(map);
    }

    public void consume(IMap<Long, Long> distributedMap) {
        Stream.iterate(0, (i) -> ++i)
            .forEach(i -> {
                LOGGER.info("Get by key {}. Value is {} ", i, distributedMap.get(i));
                ThreadUtils.sleepUnsafe(1000);
            });
    }

}