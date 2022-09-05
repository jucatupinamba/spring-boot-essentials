package com.springboot.essentials.repository;

import com.springboot.essentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
