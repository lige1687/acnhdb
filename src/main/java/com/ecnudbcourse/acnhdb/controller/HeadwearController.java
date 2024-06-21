package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Headwear;
import com.ecnudbcourse.acnhdb.service.HeadwearService;
import com.ecnudbcourse.acnhdb.dto.HeadwearMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/headwear")
public class HeadwearController {

    @Autowired
    private HeadwearService headwearService;

    @GetMapping
    public List<Headwear> getAll() { return headwearService.getAll(); }

    @GetMapping("/{id}")
    public Headwear getById(@PathVariable Long id) { return headwearService.getById(id); }

    @GetMapping("/findByName")
    public List<Headwear> findByName(@RequestParam String name) { return headwearService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Headwear> searchHeadwearByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return headwearService.searchHeadwearByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Headwear> searchHeadwearBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return headwearService.searchHeadwearBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Headwear> searchHeadwearByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return headwearService.searchHeadwearByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Headwear> searchHeadwearByDiy(@RequestParam(required = false) String diy) {
        return headwearService.searchHeadwearByDiy(diy);
    }

    @GetMapping("/materials")
    public List<HeadwearMaterials> getHeadwearMaterialsByName(@RequestParam String name) {
        return headwearService.getHeadwearMaterialsByName(name);
    }
}
