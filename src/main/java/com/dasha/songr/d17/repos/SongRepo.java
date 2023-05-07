package com.dasha.songr.d17.repos;

import com.dasha.songr.d17.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Long> {

}
