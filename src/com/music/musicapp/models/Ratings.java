package com.music.musicapp.models;

public class Ratings {
    public void include(Audio audio){
        if(audio.getRating() >= 9)
            System.out.println(audio.getTitle() + " is a huge success among listeners!");
        else
            System.out.println("Add " + audio.getTitle() + " to your playlist!");
    }
}
