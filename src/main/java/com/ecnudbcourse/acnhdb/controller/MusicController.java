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

    @GetMapping("/searchColor1")
    public List<Music> searchMusicByColor1(@RequestParam(required = false) String color1) {
        return musicService.searchMusicByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Music> searchMusicByColor2(@RequestParam(required = false) String color2) {
        return musicService.searchMusicByColor2(color2);
    }

    @GetMapping("/searchSize")
    public List<Music> searchMusicBySize(@RequestParam(required = false) String size) {
        return musicService.searchMusicBySize(size);
    }

    @GetMapping("/searchSource")
    public List<Music> searchMusicBySource(@RequestParam(required = false) String source) {
        return musicService.searchMusicBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Music> searchMusicBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return musicService.searchMusicBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchCatalog")
    public List<Music> searchMusicByCatalog(@RequestParam(required = false) String catalog) {
        return musicService.searchMusicByCatalog(catalog);
    }
}
