package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fish;
import com.ecnudbcourse.acnhdb.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/fish")
public class FishController {

    @Autowired
    private FishService fishService;

    @GetMapping
    public List<Fish> getAll() { return fishService.getAll(); }

    @GetMapping("/{id}")
    public Fish getById(@PathVariable Long id) { return fishService.getById(id); }

    @GetMapping("/findByName")
    public List<Fish> findByName(@RequestParam String name) { return fishService.findByName(name); }

    // 格式 如上 ,GET /api/activities/active?month=Jun&time=8AM
    @GetMapping("/searchSell")
    public List<Fish> searchFishBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return fishService.searchFishBySellRangeAndSort(min, max, sort);
    }
}
