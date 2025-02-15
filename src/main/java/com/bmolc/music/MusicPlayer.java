package com.bmolc.music;

import com.bmolc.music.Music;

public class MusicPlayer {
    private Music music;

    //IoC(здесь происходит внедрение зависимости)
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
