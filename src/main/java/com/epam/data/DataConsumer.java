package com.epam.data;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class DataConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataConsumer.class);

    public void consume(IMap<Long, Long> distributedMap) {
        long start = System.currentTimeMillis();
        Stream.iterate(0, (i) -> ++i)
            .forEach(i -> {

                long key = i;
                LOGGER.info("Get by key {}. Value is {} ", key, distributedMap.get(key));
                //ThreadUtils.sleepUnsafe(10);
                if (i % 100000 == 0) {
                    LOGGER.info("Time for getting 1000 = {} ms.", System.currentTimeMillis() - start);

                }
            });
    }

}
