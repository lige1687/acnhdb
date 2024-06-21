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
}
