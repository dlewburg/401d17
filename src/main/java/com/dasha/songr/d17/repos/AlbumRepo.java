package com.dasha.songr.d17.repos;

import com.dasha.songr.d17.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepo extends JpaRepository<Album, Long> {
    public Album findByTitle(String title);
    // Come with JPA Repo by default --> is save(), deleted(), update(), findAll()
    // no need to define in JPA repo because it is part of the magic that JPA has
}
