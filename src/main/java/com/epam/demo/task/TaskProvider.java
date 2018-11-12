package com.epam.demo.task;

import com.epam.event.Event;
import com.epam.event.EventImpl2;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.IQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskProvider.class);

    public void provide(IQueue<Event> events) {
        while (true) {
            ThreadUtils.sleepUnsafe(2000);
            LOGGER.info("Pushing event to queue...");
            events.add(new EventImpl2());
        }
    }

}