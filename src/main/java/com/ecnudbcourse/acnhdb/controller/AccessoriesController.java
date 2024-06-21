package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Accessories;
import com.ecnudbcourse.acnhdb.service.AccessoriesService;
import com.ecnudbcourse.acnhdb.dto.AccessoriesMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/accessories")
public class AccessoriesController {

    @Autowired
    private AccessoriesService accessoriesService;

    @GetMapping
    public List<Accessories> getAll() { return accessoriesService.getAll(); }

    @GetMapping("/{id}")
    public Accessories getById(@PathVariable Long id) { return accessoriesService.getById(id); }

    @GetMapping("/findByName")
    public List<Accessories> findByName(@RequestParam String name) { return accessoriesService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Accessories> searchAccessoriesByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return accessoriesService.searchAccessoriesByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Accessories> searchAccessoriesBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return accessoriesService.searchAccessoriesBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Accessories> searchAccessoriesByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return accessoriesService.searchAccessoriesByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Accessories> searchAccessoriesByDiy(@RequestParam(required = false) String diy) {
        return accessoriesService.searchAccessoriesByDiy(diy);
    }

    @GetMapping("/materials")
    public List<AccessoriesMaterials> getAccessoriesMaterialsByName(@RequestParam String name) {
        return accessoriesService.getAccessoriesMaterialsByName(name);
    }
}
