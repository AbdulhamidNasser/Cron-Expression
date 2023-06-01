package com.codeline.Cron.Expression;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "*/5 * * * 1-5 && */15 * * * 6-7")
    public void schedle1(){
        System.out.println("Hello world");
    }
}
