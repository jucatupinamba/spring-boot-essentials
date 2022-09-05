package com.springboot.essentials.controller;


import com.springboot.essentials.domain.Anime;
import com.springboot.essentials.service.AnimeService;
import com.springboot.essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;
    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
       return animeService.listAll();
    }
}
