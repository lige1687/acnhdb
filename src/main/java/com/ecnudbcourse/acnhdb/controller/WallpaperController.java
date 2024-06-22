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

    @GetMapping("/searchVfx")
    public List<Wallpaper> searchWallpaperByVfx(@RequestParam(required = false) String vfx) {
        return wallpaperService.searchWallpaperByVfx(vfx);
    }

    @GetMapping("/searchVfxType")
    public List<Wallpaper> searchWallpaperByVfxType(@RequestParam(required = false) String vfxType) {
        return wallpaperService.searchWallpaperByVfxType(vfxType);
    }

    @GetMapping("/searchDiy")
    public List<Wallpaper> searchWallpaperByDiy(@RequestParam(required = false) String diy) {
        return wallpaperService.searchWallpaperByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Wallpaper> searchWallpaperByColor1(@RequestParam(required = false) String color1) {
        return wallpaperService.searchWallpaperByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Wallpaper> searchWallpaperByColor2(@RequestParam(required = false) String color2) {
        return wallpaperService.searchWallpaperByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Wallpaper> searchWallpaperBySource(@RequestParam(required = false) String source) {
        return wallpaperService.searchWallpaperBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Wallpaper> searchWallpaperBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return wallpaperService.searchWallpaperBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchCatalog")
    public List<Wallpaper> searchWallpaperByCatalog(@RequestParam(required = false) String catalog) {
        return wallpaperService.searchWallpaperByCatalog(catalog);
    }

    @GetMapping("/searchWindowType")
    public List<Wallpaper> searchWallpaperByWindowType(@RequestParam(required = false) String windowType) {
        return wallpaperService.searchWallpaperByWindowType(windowType);
    }

    @GetMapping("/searchWindowColor")
    public List<Wallpaper> searchWallpaperByWindowColor(@RequestParam(required = false) String windowColor) {
        return wallpaperService.searchWallpaperByWindowColor(windowColor);
    }

    @GetMapping("/searchPaneType")
    public List<Wallpaper> searchWallpaperByPaneType(@RequestParam(required = false) String paneType) {
        return wallpaperService.searchWallpaperByPaneType(paneType);
    }

    @GetMapping("/searchCurtainType")
    public List<Wallpaper> searchWallpaperByCurtainType(@RequestParam(required = false) String curtainType) {
        return wallpaperService.searchWallpaperByCurtainType(curtainType);
    }

    @GetMapping("/searchCurtainColor")
    public List<Wallpaper> searchWallpaperByCurtainColor(@RequestParam(required = false) String curtainColor) {
        return wallpaperService.searchWallpaperByCurtainColor(curtainColor);
    }

    @GetMapping("/searchCeilingType")
    public List<Wallpaper> searchWallpaperByCeilingType(@RequestParam(required = false) String ceilingType) {
        return wallpaperService.searchWallpaperByCeilingType(ceilingType);
    }

    @GetMapping("/searchHhaConcept1")
    public List<Wallpaper> searchWallpaperByHhaConcept1(@RequestParam(required = false) String hhaConcept1) {
        return wallpaperService.searchWallpaperByHhaConcept1(hhaConcept1);
    }

    @GetMapping("/searchHhaConcept2")
    public List<Wallpaper> searchWallpaperByHhaConcept2(@RequestParam(required = false) String hhaConcept2) {
        return wallpaperService.searchWallpaperByHhaConcept2(hhaConcept2);
    }

    @GetMapping("/searchHhaSeries")
    public List<Wallpaper> searchWallpaperByHhaSeries(@RequestParam(required = false) String hhaSeries) {
        return wallpaperService.searchWallpaperByHhaSeries(hhaSeries);
    }

    @GetMapping("/searchTag")
    public List<Wallpaper> searchWallpaperByTag(@RequestParam(required = false) String tag) {
        return wallpaperService.searchWallpaperByTag(tag);
    }

    @GetMapping("/materials")
    public List<WallpaperMaterials> getWallpaperMaterialsByName(@RequestParam String name) {
        return wallpaperService.getWallpaperMaterialsByName(name);
    }
}
