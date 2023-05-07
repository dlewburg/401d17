package com.dasha.songr.d17.controllers;
import com.dasha.songr.d17.models.Album;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Controller
public class SongController {

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
    public  String album(Model m) {
        ArrayList<Album> album = new ArrayList<>();
                Album album1 = new Album ("Anti (Deluxe)", "Rihanna", 16, 3058,"img/Anti.png" );
        Album album2 = new Album("Ready(Deluxe Version)", "Trey Songz", 20, 3490, "img/Ready.png" );
        Album album3 = new Album("Ctrl", "Sza", 14, 2946, "img/Ctrl.png");
        album.add(album1);
        album.add(album2);
        album.add(album3);
        m.addAttribute("album", album);
        return "album";
    }
}
