package com.bmolc.music;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Symphony 7";
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("предбиновый метод отработал!");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("послеюиный метод отработал!");
    }
}
