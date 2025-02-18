package com.bmolc.music;

import com.bmolc.music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MusicPlayer {

//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;
//
//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }
//
//    public String playMusicString() {
//        return "Playing " + music.getSong();
//    }

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusicString() {
        return "Playing " + music1.getSong() + ", " + music2.getSong();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
