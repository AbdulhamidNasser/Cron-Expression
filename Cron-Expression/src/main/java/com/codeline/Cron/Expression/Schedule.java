package com.codeline.Cron.Expression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 0 22 * 7-9 0")
    public void schedle1(){
        System.out.println("Hello world");
    }
}
