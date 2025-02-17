package com.bmolc;

import com.bmolc.music.Music;
import com.bmolc.music.MusicPlayer;
import com.bmolc.music.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

//        доп.пример с роком
        Music rockMusic = context.getBean(RockMusic.class);
        MusicPlayer musicPlayerRock = new MusicPlayer(rockMusic);
        musicPlayerRock.playMusic();

    }
}
