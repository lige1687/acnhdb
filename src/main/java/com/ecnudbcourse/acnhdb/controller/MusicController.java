package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Music;
import com.ecnudbcourse.acnhdb.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public List<Music> getAll() { return musicService.getAll(); }

    @GetMapping("/{id}")
    public Music getById(@PathVariable Long id) { return musicService.getById(id); }

    @GetMapping("/findByName")
    public List<Music> findByName(@RequestParam String name) { return musicService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Music> searchMusicByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return musicService.searchMusicByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Music> searchMusicBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return musicService.searchMusicBySellRangeAndSort(min, max, sort);
    }
}
