package com.music.musicapp.models;

public class Podcast extends Audio {
    private String host;
    private String guests;
    private String theme;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
