package com.bmolc;

import com.bmolc.music.MusicOnePlayer;
import com.bmolc.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicOnePlayer musicPlayer = context.getBean("musicPlayer", MusicOnePlayer.class);
//
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.getSongs();

        context.close();
    }
}
