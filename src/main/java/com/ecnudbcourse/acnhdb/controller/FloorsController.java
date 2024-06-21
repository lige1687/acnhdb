package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Floors;
import com.ecnudbcourse.acnhdb.service.FloorsService;
import com.ecnudbcourse.acnhdb.dto.FloorsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/floors")
public class FloorsController {

    @Autowired
    private FloorsService floorsService;

    @GetMapping
    public List<Floors> getAll() { return floorsService.getAll(); }

    @GetMapping("/{id}")
    public Floors getById(@PathVariable Long id) { return floorsService.getById(id); }

    @GetMapping("/findByName")
    public List<Floors> findByName(@RequestParam String name) { return floorsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Floors> searchFloorsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return floorsService.searchFloorsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Floors> searchFloorsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return floorsService.searchFloorsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Floors> searchFloorsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return floorsService.searchFloorsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Floors> searchFloorsByDiy(@RequestParam(required = false) String diy) {
        return floorsService.searchFloorsByDiy(diy);
    }

    @GetMapping("/searchVfx")
    public List<Floors> searchFloorsByVfx(@RequestParam(required = false) String vfx) {
        return floorsService.searchFloorsByVfx(vfx);
    }

    @GetMapping("/materials")
    public List<FloorsMaterials> getFloorsMaterialsByName(@RequestParam String name) {
        return floorsService.getFloorsMaterialsByName(name);
    }
}
