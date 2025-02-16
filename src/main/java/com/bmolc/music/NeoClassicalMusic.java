package com.bmolc.music;

public class NeoClassicalMusic implements Music{

    private NeoClassicalMusic(){
    }

    public static NeoClassicalMusic getNeoClassicalMusic() {
        return new NeoClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Electro_Symphony_7";
    }
}
