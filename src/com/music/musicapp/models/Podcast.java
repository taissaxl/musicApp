package com.music.musicapp.models;

public class Podcast extends Audio {
    private String host;
    private String theme;
    private String description;
    private int episode;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEpisode() {
        return episode;
    }

    @Override
    public int getRating(){
        if(this.getLikes() > 200)
            return 10;
        else
            return 8;
    }
}
