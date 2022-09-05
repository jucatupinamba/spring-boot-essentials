package com.springboot.essentials.service;

import com.springboot.essentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimeService {
    public List<Anime> listAll(){
        return List.of(new Anime(1L, "DBZ"), new Anime(2L,"One Piece"));
    }
}
