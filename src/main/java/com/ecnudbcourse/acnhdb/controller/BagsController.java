package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Bags;
import com.ecnudbcourse.acnhdb.service.BagsService;
import com.ecnudbcourse.acnhdb.dto.BagsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/bags")
public class BagsController {

    @Autowired
    private BagsService bagsService;

    @GetMapping
    public List<Bags> getAll() { return bagsService.getAll(); }

    @GetMapping("/{id}")
    public Bags getById(@PathVariable Long id) { return bagsService.getById(id); }

    @GetMapping("/findByName")
    public List<Bags> findByName(@RequestParam String name) { return bagsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Bags> searchBagsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bagsService.searchBagsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Bags> searchBagsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bagsService.searchBagsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Bags> searchBagsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bagsService.searchBagsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Bags> searchBagsByDiy(@RequestParam(required = false) String diy) {
        return bagsService.searchBagsByDiy(diy);
    }

    @GetMapping("/materials")
    public List<BagsMaterials> getBagsMaterialsByName(@RequestParam String name) {
        return bagsService.getBagsMaterialsByName(name);
    }
}
