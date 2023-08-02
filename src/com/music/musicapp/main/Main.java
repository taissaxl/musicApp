package com.music.musicapp.main;

import com.music.musicapp.models.Music;
import com.music.musicapp.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("NASA");
        music.setArtist("Ariana Grande");

        for (int i = 0; i < 1000; i++) {
            music.playAudio();
        }

        for (int i = 0; i < 50; i++) {
            music.like();
        }

        System.out.println("Total listeners to 'NASA' by Ariana Grande: " + music.getTotalListeners());
        System.out.println("Likes: " + music.getLikes());

        Podcast podcast = new Podcast();
        podcast.setTitle("Podcast but Outside");
        podcast.setHost("Andrew and Cole");

        for (int i = 0; i < 1000; i++) {
            podcast.playAudio();
        }

        for (int i = 0; i < 500; i++) {
            podcast.like();
        }

        System.out.println("Total listeners to Podcast But Outside: " + podcast.getTotalListeners());
        System.out.println("Likes: " + podcast.getLikes());
    }
}