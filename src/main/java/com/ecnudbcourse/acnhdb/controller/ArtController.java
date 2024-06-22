package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Art;
import com.ecnudbcourse.acnhdb.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/art")
public class ArtController {

    @Autowired
    private ArtService artService;

    @GetMapping
    public List<Art> getAll() { return artService.getAll(); }

    @GetMapping("/{id}")
    public Art getById(@PathVariable Long id) { return artService.getById(id); }

    @GetMapping("/findByName")
    public List<Art> findByName(@RequestParam String name) { return artService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Art> searchArtByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return artService.searchArtByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Art> searchArtBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return artService.searchArtBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchGenuine")
    public List<Art> searchArtByGenuine(@RequestParam(required = false) String genuine) {
        return artService.searchArtByGenuine(genuine);
    }

    @GetMapping("/searchCategory")
    public List<Art> searchArtByCategory(@RequestParam(required = false) String category) {
        return artService.searchArtByCategory(category);
    }

    @GetMapping("/searchSize")
    public List<Art> searchArtBySize(@RequestParam(required = false) String size) {
        return artService.searchArtBySize(size);
    }

    @GetMapping("/searchRealArtworkTitle")
    public List<Art> searchArtByRealArtworkTitle(@RequestParam(required = false) String realArtworkTitle) {
        return artService.searchArtByRealArtworkTitle(realArtworkTitle);
    }

    @GetMapping("/searchArtist")
    public List<Art> searchArtByArtist(@RequestParam(required = false) String artist) {
        return artService.searchArtByArtist(artist);
    }

    @GetMapping("/searchMuseumDescription")
    public List<Art> searchArtByMuseumDescription(@RequestParam(required = false) String museumDescription) {
        return artService.searchArtByMuseumDescription(museumDescription);
    }

    @GetMapping("/searchHhaConcept1")
    public List<Art> searchArtByHhaConcept1(@RequestParam(required = false) String hhaConcept1) {
        return artService.searchArtByHhaConcept1(hhaConcept1);
    }

    @GetMapping("/searchHhaConcept2")
    public List<Art> searchArtByHhaConcept2(@RequestParam(required = false) String hhaConcept2) {
        return artService.searchArtByHhaConcept2(hhaConcept2);
    }

    @GetMapping("/searchTag")
    public List<Art> searchArtByTag(@RequestParam(required = false) String tag) {
        return artService.searchArtByTag(tag);
    }
}
