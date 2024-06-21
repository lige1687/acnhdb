package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Rugs;
import com.ecnudbcourse.acnhdb.service.RugsService;
import com.ecnudbcourse.acnhdb.dto.RugsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/rugs")
public class RugsController {

    @Autowired
    private RugsService rugsService;

    @GetMapping
    public List<Rugs> getAll() { return rugsService.getAll(); }

    @GetMapping("/{id}")
    public Rugs getById(@PathVariable Long id) { return rugsService.getById(id); }

    @GetMapping("/findByName")
    public List<Rugs> findByName(@RequestParam String name) { return rugsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Rugs> searchRugsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return rugsService.searchRugsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Rugs> searchRugsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return rugsService.searchRugsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Rugs> searchRugsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return rugsService.searchRugsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Rugs> searchRugsByDiy(@RequestParam(required = false) String diy) {
        return rugsService.searchRugsByDiy(diy);
    }

    @GetMapping("/materials")
    public List<RugsMaterials> getRugsMaterialsByName(@RequestParam String name) {
        return rugsService.getRugsMaterialsByName(name);
    }
}
