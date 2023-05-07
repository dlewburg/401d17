package com.dasha.songr.d17.models;

import jakarta.persistence.*;

@Entity

public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int songLength;
    int trackNumber;
    String albumTitle;
    @ManyToOne
    Album album;

    protected Song() {}

    public Song(String title, int songLength, int trackNumber, String albumTitle, Album album) {
        this.title = title;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
        this.albumTitle = albumTitle;
        this.album = album;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String album) {
        this.albumTitle = albumTitle;
    }


    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", songLength=" + songLength +
                ", trackNumber=" + trackNumber +
                ", albumTitle='" + albumTitle + '\'' +
                ", album=" + album +
                '}';
    }
}
