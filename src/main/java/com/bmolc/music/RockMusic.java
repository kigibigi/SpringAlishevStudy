package com.bmolc.music;

import com.bmolc.music.Music;
import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rape me";
    }
}
