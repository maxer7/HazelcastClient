package com.epam.event;

import com.epam.util.ThreadUtils;

public class EventImpl implements Event {
    @Override
    public void process() {
        System.out.println("Processing....");
        ThreadUtils.sleepUnsafe(1000L);
    }
}
