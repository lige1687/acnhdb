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

    @GetMapping("/searchVariation")
    public List<Bags> searchBagsByVariation(@RequestParam(required = false) String variation) {
        return bagsService.searchBagsByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<Bags> searchBagsByDiy(@RequestParam(required = false) String diy) {
        return bagsService.searchBagsByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Bags> searchBagsByColor1(@RequestParam(required = false) String color1) {
        return bagsService.searchBagsByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Bags> searchBagsByColor2(@RequestParam(required = false) String color2) {
        return bagsService.searchBagsByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Bags> searchBagsBySource(@RequestParam(required = false) String source) {
        return bagsService.searchBagsBySource(source);
    }

    @GetMapping("/searchStyle")
    public List<Bags> searchBagsByStyle(@RequestParam(required = false) String style) {
        return bagsService.searchBagsByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Bags> searchBagsByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return bagsService.searchBagsByLabelThemes(labelThemes);
    }

    @GetMapping("/searchCatalog")
    public List<Bags> searchBagsByCatalog(@RequestParam(required = false) String catalog) {
        return bagsService.searchBagsByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<BagsMaterials> getBagsMaterialsByName(@RequestParam String name) {
        return bagsService.getBagsMaterialsByName(name);
    }
}
