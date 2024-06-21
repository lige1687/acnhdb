package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.service.ShoesService;
import com.ecnudbcourse.acnhdb.dto.ShoesMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/shoes")
public class ShoesController {

    @Autowired
    private ShoesService shoesService;

    @GetMapping
    public List<Shoes> getAll() { return shoesService.getAll(); }

    @GetMapping("/{id}")
    public Shoes getById(@PathVariable Long id) { return shoesService.getById(id); }

    @GetMapping("/findByName")
    public List<Shoes> findByName(@RequestParam String name) { return shoesService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Shoes> searchShoesByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return shoesService.searchShoesByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Shoes> searchShoesBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return shoesService.searchShoesBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Shoes> searchShoesByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return shoesService.searchShoesByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Shoes> searchShoesByDiy(@RequestParam(required = false) String diy) {
        return shoesService.searchShoesByDiy(diy);
    }

    @GetMapping("/materials")
    public List<ShoesMaterials> getShoesMaterialsByName(@RequestParam String name) {
        return shoesService.getShoesMaterialsByName(name);
    }
}
