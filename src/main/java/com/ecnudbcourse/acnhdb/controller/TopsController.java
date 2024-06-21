package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Tops;
import com.ecnudbcourse.acnhdb.service.TopsService;
import com.ecnudbcourse.acnhdb.dto.TopsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/tops")
public class TopsController {

    @Autowired
    private TopsService topsService;

    @GetMapping
    public List<Tops> getAll() { return topsService.getAll(); }

    @GetMapping("/{id}")
    public Tops getById(@PathVariable Long id) { return topsService.getById(id); }

    @GetMapping("/findByName")
    public List<Tops> findByName(@RequestParam String name) { return topsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Tops> searchTopsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return topsService.searchTopsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Tops> searchTopsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return topsService.searchTopsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Tops> searchTopsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return topsService.searchTopsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Tops> searchTopsByDiy(@RequestParam(required = false) String diy) {
        return topsService.searchTopsByDiy(diy);
    }

    @GetMapping("/materials")
    public List<TopsMaterials> getTopsMaterialsByName(@RequestParam String name) {
        return topsService.getTopsMaterialsByName(name);
    }
}
