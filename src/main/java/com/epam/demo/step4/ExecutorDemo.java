package com.epam.demo.step4;

import com.epam.executor.SumTask;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.IExecutorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class ExecutorDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExecutorDemo.class);

    public void show(IExecutorService executorService) {
        Stream.iterate(0, i -> ++i)
            .forEach(i -> {
                LOGGER.info("Submitting task {}", i);
                executorService.execute(new SumTask(i, i , i+1));
                ThreadUtils.sleepUnsafe(100);
            });
    }

}
