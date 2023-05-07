package com.dasha.songr.d17.controllers;
import com.dasha.songr.d17.models.Album;
import com.dasha.songr.d17.repos.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongController {
    @Autowired
    AlbumRepo albumRepo;


    @GetMapping("/")
    public String splash() {
        return "splash";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(Model m, @PathVariable String text) {
        m.addAttribute("capText", text.toUpperCase());
        return "capitalize";
    }

    @GetMapping("/album")
    public String album(Model m) {
        List<Album> album = albumRepo.findAll();
        m.addAttribute("album", album);
//        Album album1 = new Album ("Anti (Deluxe)", "Rihanna", 16, 3058,"img/Anti.png" );
//        Album album2 = new Album("Ready(Deluxe Version)", "Trey Songz", 20, 3490, "img/Ready.png" );
//        Album album3 = new Album("Ctrl", "Sza", 14, 2946, "img/Ctrl.png");
//        album.add(album1);
//        album.add(album2);
//        album.add(album3);
//        m.addAttribute("album", album);
        return "album";
    }

    @PostMapping("/")
    public RedirectView createAlbum(String title, String artist, int songCount, int songLength, String imgUrl) {
        Album newAlbum = new Album(title, artist, songCount, songLength, imgUrl);
        albumRepo.save(newAlbum);

        return new RedirectView("/album");
    }

    @PostMapping("/album-store/")
    public RedirectView createAddedAlbum(String title, String artist, int songCount, int songLength, String imgUrl) {
        Album newAlbum = new Album(title, artist, songCount, songLength, imgUrl);
        albumRepo.save(newAlbum);

        return new RedirectView("/album");
    }
}