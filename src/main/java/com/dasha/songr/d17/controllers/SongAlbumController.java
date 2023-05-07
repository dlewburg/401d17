package com.dasha.songr.d17.controllers;

import com.dasha.songr.d17.models.Album;
import com.dasha.songr.d17.models.Song;
import com.dasha.songr.d17.repos.AlbumRepo;
import com.dasha.songr.d17.repos.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongAlbumController {
    @Autowired
    AlbumRepo albumRepo;

    @Autowired
    SongRepo songRepo;

    @PostMapping("/song/add")
    public RedirectView addSong(String title, int songLength, int trackNumber, String albumTitle, Album album, long songAlbumId){
        Album albumAdd;
        if(albumRepo.findByTitle(albumTitle) != null) {
            albumAdd = albumRepo.findByTitle(albumTitle);
        } else {
            throw new IllegalArgumentException("Could not find Album for this Song in DB");
        }

        Song song = new Song(title, songLength, trackNumber, albumTitle, album);
        songRepo.save(song);
        return new RedirectView("/album");

    }
}
