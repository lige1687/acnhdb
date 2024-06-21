package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fossils;
import com.ecnudbcourse.acnhdb.service.FossilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/fossils")
public class FossilsController {

    @Autowired
    private FossilsService fossilsService;

    @GetMapping
    public List<Fossils> getAll() { return fossilsService.getAll(); }

    @GetMapping("/{id}")
    public Fossils getById(@PathVariable Long id) { return fossilsService.getById(id); }

    @GetMapping("/findByName")
    public List<Fossils> findByName(@RequestParam String name) { return fossilsService.findByName(name); }


    @GetMapping("/searchSell")
    public List<Fossils> searchFossilsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return fossilsService.searchFossilsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchInteract")
    public List<Fossils> searchFossilsByInteract(@RequestParam(required = false) String interact) {
        return fossilsService.searchFossilsByInteract(interact);
    }
}
