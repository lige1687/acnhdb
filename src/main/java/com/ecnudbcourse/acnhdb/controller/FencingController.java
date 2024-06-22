package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fencing;
import com.ecnudbcourse.acnhdb.service.FencingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/fencing")
public class FencingController {

    @Autowired
    private FencingService fencingService;

    @GetMapping
    public List<Fencing> getAll() { return fencingService.getAll(); }

    @GetMapping("/{id}")
    public Fencing getById(@PathVariable Long id) { return fencingService.getById(id); }

    @GetMapping("/findByName")
    public List<Fencing> findByName(@RequestParam String name) { return fencingService.findByName(name); }


    @GetMapping("/searchSell")
    public List<Fencing> searchFencingBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return fencingService.searchFencingBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSource")
    public List<Fencing> searchFencingBySource(@RequestParam(required = false) String source) {
        return fencingService.searchFencingBySource(source);
    }
}
