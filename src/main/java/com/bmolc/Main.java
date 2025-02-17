package com.bmolc;

import com.bmolc.music.Computer;
import com.bmolc.music.Music;
import com.bmolc.music.MusicPlayer;
import com.bmolc.music.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println();

        Computer computer = context.getBean(Computer.class);
        System.out.println(computer);

        context.close();
    }
}
