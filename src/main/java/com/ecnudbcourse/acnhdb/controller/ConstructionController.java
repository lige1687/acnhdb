package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Construction;
import com.ecnudbcourse.acnhdb.service.ConstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/construction")
public class ConstructionController {

    @Autowired
    private ConstructionService constructionService;

    @GetMapping
    public List<Construction> getAll() { return constructionService.getAll(); }

    @GetMapping("/{id}")
    public Construction getById(@PathVariable Long id) { return constructionService.getById(id); }

    @GetMapping("/findByName")
    public List<Construction> findByName(@RequestParam String name) { return constructionService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Construction> searchConstructionByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return constructionService.searchConstructionByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchCategory")
    public List<Construction> searchConstructionByCategory(@RequestParam(required = false) String category) {
        return constructionService.searchConstructionByCategory(category);
    }

    @GetMapping("/searchSource")
    public List<Construction> searchConstructionBySource(@RequestParam(required = false) String source) {
        return constructionService.searchConstructionBySource(source);
    }
}
