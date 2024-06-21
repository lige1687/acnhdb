package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.DressUp;
import com.ecnudbcourse.acnhdb.service.DressUpService;
import com.ecnudbcourse.acnhdb.dto.DressUpMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/dress_up")
public class DressUpController {

    @Autowired
    private DressUpService dress_upService;

    @GetMapping
    public List<DressUp> getAll() { return dress_upService.getAll(); }

    @GetMapping("/{id}")
    public DressUp getById(@PathVariable Long id) { return dress_upService.getById(id); }

    @GetMapping("/findByName")
    public List<DressUp> findByName(@RequestParam String name) { return dress_upService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<DressUp> searchDressUpByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return dress_upService.searchDressUpByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<DressUp> searchDressUpBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return dress_upService.searchDressUpBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<DressUp> searchDressUpByDiy(@RequestParam(required = false) String diy) {
        return dress_upService.searchDressUpByDiy(diy);
    }

    @GetMapping("/materials")
    public List<DressUpMaterials> getDressUpMaterialsByName(@RequestParam String name) {
        return dress_upService.getDressUpMaterialsByName(name);
    }
}
