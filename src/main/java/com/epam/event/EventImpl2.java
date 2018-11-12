package com.epam.event;

import com.epam.util.ThreadUtils;

public class EventImpl2 implements Event {
    @Override
    public void process() {
        System.out.println("Processing2....");
        ThreadUtils.sleepUnsafe(1000L);
    }
}
