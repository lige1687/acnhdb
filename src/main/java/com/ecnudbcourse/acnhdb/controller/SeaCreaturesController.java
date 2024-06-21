package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.SeaCreatures;
import com.ecnudbcourse.acnhdb.service.SeaCreaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/sea_creatures")
public class SeaCreaturesController {

    @Autowired
    private SeaCreaturesService sea_creaturesService;

    @GetMapping
    public List<SeaCreatures> getAll() { return sea_creaturesService.getAll(); }

    @GetMapping("/{id}")
    public SeaCreatures getById(@PathVariable Long id) { return sea_creaturesService.getById(id); }

    @GetMapping("/findByName")
    public List<SeaCreatures> findByName(@RequestParam String name) { return sea_creaturesService.findByName(name); }


    @GetMapping("/searchSell")
    public List<SeaCreatures> searchSeaCreaturesBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return sea_creaturesService.searchSeaCreaturesBySellRangeAndSort(min, max, sort);
    }
}
