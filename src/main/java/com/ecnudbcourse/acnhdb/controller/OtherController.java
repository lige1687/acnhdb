package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Other;
import com.ecnudbcourse.acnhdb.service.OtherService;
import com.ecnudbcourse.acnhdb.dto.OtherMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/other")
public class OtherController {

    @Autowired
    private OtherService otherService;

    @GetMapping
    public List<Other> getAll() { return otherService.getAll(); }

    @GetMapping("/{id}")
    public Other getById(@PathVariable Long id) { return otherService.getById(id); }

    @GetMapping("/findByName")
    public List<Other> findByName(@RequestParam String name) { return otherService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Other> searchOtherByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return otherService.searchOtherByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Other> searchOtherBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return otherService.searchOtherBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Other> searchOtherByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return otherService.searchOtherByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Other> searchOtherByDiy(@RequestParam(required = false) String diy) {
        return otherService.searchOtherByDiy(diy);
    }

    @GetMapping("/materials")
    public List<OtherMaterials> getOtherMaterialsByName(@RequestParam String name) {
        return otherService.getOtherMaterialsByName(name);
    }
}
