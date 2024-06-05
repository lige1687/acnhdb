package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Music;
import com.ecnudbcourse.acnhdb.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

}
