package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Bottoms;
import com.ecnudbcourse.acnhdb.service.BottomsService;
import com.ecnudbcourse.acnhdb.dto.BottomsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/bottoms")
public class BottomsController {

    @Autowired
    private BottomsService bottomsService;

    @GetMapping
    public List<Bottoms> getAll() { return bottomsService.getAll(); }

    @GetMapping("/{id}")
    public Bottoms getById(@PathVariable Long id) { return bottomsService.getById(id); }

    @GetMapping("/findByName")
    public List<Bottoms> findByName(@RequestParam String name) { return bottomsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Bottoms> searchBottomsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bottomsService.searchBottomsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Bottoms> searchBottomsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bottomsService.searchBottomsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Bottoms> searchBottomsByDiy(@RequestParam(required = false) String diy) {
        return bottomsService.searchBottomsByDiy(diy);
    }

    @GetMapping("/materials")
    public List<BottomsMaterials> getBottomsMaterialsByName(@RequestParam String name) {
        return bottomsService.getBottomsMaterialsByName(name);
    }
}
