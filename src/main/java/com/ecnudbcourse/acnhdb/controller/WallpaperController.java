package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Wallpaper;
import com.ecnudbcourse.acnhdb.service.WallpaperService;
import com.ecnudbcourse.acnhdb.dto.WallpaperMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

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


    @GetMapping("/searchBuy")
    public List<Wallpaper> searchWallpaperByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return wallpaperService.searchWallpaperByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Wallpaper> searchWallpaperBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return wallpaperService.searchWallpaperBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Wallpaper> searchWallpaperByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return wallpaperService.searchWallpaperByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Wallpaper> searchWallpaperByDiy(@RequestParam(required = false) String diy) {
        return wallpaperService.searchWallpaperByDiy(diy);
    }

    @GetMapping("/searchVfx")
    public List<Wallpaper> searchWallpaperByVfx(@RequestParam(required = false) String vfx) {
        return wallpaperService.searchWallpaperByVfx(vfx);
    }

    @GetMapping("/materials")
    public List<WallpaperMaterials> getWallpaperMaterialsByName(@RequestParam String name) {
        return wallpaperService.getWallpaperMaterialsByName(name);
    }
}
