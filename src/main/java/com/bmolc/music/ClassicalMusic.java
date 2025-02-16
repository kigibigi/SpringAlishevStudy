package com.bmolc.music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Symphony 7";
    }

    public void initMethod() {
        System.out.println("Init Method");
    }

    public void destroyMethod() {
        System.out.println("Destroy Method");
    }
}
