package com.dasha.songr.d17.models;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int songLength;
    String imgUrl;

    @OneToMany(mappedBy="album", cascade=CascadeType.ALL)
    List<Song> songList;
    protected Album() {}

    public Album(String title, String artist, int songCount, int songLength, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.songLength = songLength;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", songLength=" + songLength +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
