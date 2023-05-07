package com.dasha.songr.d17.repos;

import com.dasha.songr.d17.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepo extends JpaRepository<Album, Long> {
    public Album findByName(String title);
}
