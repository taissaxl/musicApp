package com.music.musicapp.models;

public class Audio {
    private String title;
    private double duration;
    private int totalListeners;
    private int likes;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public int getTotalListeners() {
        return totalListeners;
    }

    public int getLikes() {
        return likes++;
    }

    public void like(){
        this.likes++;
    }

    public void playAudio() {
        this.totalListeners++;
    }

    public int getRating() {
        return rating;
    }
}
