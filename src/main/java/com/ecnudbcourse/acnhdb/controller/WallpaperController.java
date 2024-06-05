package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Wallpaper;
import com.ecnudbcourse.acnhdb.service.WallpaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/wallpaper")
public class WallpaperController {

    @Autowired
    private WallpaperService wallpaperService;

    @GetMapping
    public List<Wallpaper> getAll() { return wallpaperService.getAll(); }

    @GetMapping("/{id}")
    public Wallpaper getById(@PathVariable Long id) { return wallpaperService.getById(id); }

    @GetMapping("/findByName")
    public List<Wallpaper> findByName(@RequestParam String name) { return wallpaperService.findByName(name); }

}
