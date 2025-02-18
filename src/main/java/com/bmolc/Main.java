package com.bmolc;

import com.bmolc.config.AppConfig;
import com.bmolc.music.Computer;
import com.bmolc.music.Music;
import com.bmolc.music.MusicPlayer;
import com.bmolc.music.RockMusic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println();

//        Computer computer = context.getBean(Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
