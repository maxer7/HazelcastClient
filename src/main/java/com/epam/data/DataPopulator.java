package com.epam.data;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class DataPopulator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataPopulator.class);

    public void populateRandomData(IMap<Integer, Integer> distributedMap) {
        Stream.iterate(0, (i) -> ++i)
            .forEach(i -> {
                int key = i;
                int value = (int) Math.pow(key, 2);
                distributedMap.put(key, value);
                LOGGER.info("Put {} : {} into map", key, value);
                ThreadUtils.sleepUnsafe(500);
            });
    }
}
