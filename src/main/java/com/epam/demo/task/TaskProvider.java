package com.epam.demo.task;

import com.epam.task.SumTask;
import com.epam.task.Task;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.IQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class TaskProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskProvider.class);

    public void provide(IQueue<Task> events) {
        while (true) {
            ThreadUtils.sleepUnsafe(1000);
            LOGGER.info("Pushing event to queue...");
            Random random = new Random();
            events.add(new SumTask(random.nextInt(10), random.nextInt(10)));
        }
    }

}