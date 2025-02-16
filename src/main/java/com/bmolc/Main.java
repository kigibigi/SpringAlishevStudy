package com.bmolc;

import com.bmolc.music.ClassicalMusic;
import com.bmolc.music.Music;
import com.bmolc.music.MusicPlayer;
import com.bmolc.music.NeoClassicalMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        синглтон бин
//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        System.out.println();

//       прототайп бин с инит и дестрой методами
        ClassicalMusic nextClassicalMusic = context.getBean("classicalMusicPrototype", ClassicalMusic.class);
        ClassicalMusic next2ClassicalMusic = context.getBean("classicalMusicPrototype", ClassicalMusic.class);
        ClassicalMusic next3ClassicalMusic = context.getBean("classicalMusicPrototype", ClassicalMusic.class);
        System.out.println(nextClassicalMusic.getSong());
        System.out.println(next2ClassicalMusic.getSong());
        System.out.println(next3ClassicalMusic.getSong());
        System.out.println();
        // destroy метод был в итоге один на все объетка одного бина.

//        factory-method
        NeoClassicalMusic neoClassicalMusic = context.getBean("neoClassicalMusic", NeoClassicalMusic.class);
        System.out.println(neoClassicalMusic.getSong());

        context.close();
    }
}
