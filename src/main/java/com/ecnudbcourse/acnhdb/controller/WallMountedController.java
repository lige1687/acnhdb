package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.WallMounted;
import com.ecnudbcourse.acnhdb.service.WallMountedService;
import com.ecnudbcourse.acnhdb.dto.WallMountedMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/wall_mounted")
public class WallMountedController {

    @Autowired
    private WallMountedService wall_mountedService;

    @GetMapping
    public List<WallMounted> getAll() { return wall_mountedService.getAll(); }

    @GetMapping("/{id}")
    public WallMounted getById(@PathVariable Long id) { return wall_mountedService.getById(id); }

    @GetMapping("/findByName")
    public List<WallMounted> findByName(@RequestParam String name) { return wall_mountedService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<WallMounted> searchWallMountedByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return wall_mountedService.searchWallMountedByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<WallMounted> searchWallMountedBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return wall_mountedService.searchWallMountedBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchKitCost")
    public List<WallMounted> searchWallMountedByKitCostRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return wall_mountedService.searchWallMountedByKitCostRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<WallMounted> searchWallMountedByDiy(@RequestParam(required = false) String diy) {
        return wall_mountedService.searchWallMountedByDiy(diy);
    }

    @GetMapping("/searchBodyCustomize")
    public List<WallMounted> searchWallMountedByBodyCustomize(@RequestParam(required = false) String bodyCustomize) {
        return wall_mountedService.searchWallMountedByBodyCustomize(bodyCustomize);
    }

    @GetMapping("/searchPatternCustomize")
    public List<WallMounted> searchWallMountedByPatternCustomize(@RequestParam(required = false) String patternCustomize) {
        return wall_mountedService.searchWallMountedByPatternCustomize(patternCustomize);
    }

    @GetMapping("/searchInteract")
    public List<WallMounted> searchWallMountedByInteract(@RequestParam(required = false) String interact) {
        return wall_mountedService.searchWallMountedByInteract(interact);
    }

    @GetMapping("/materials")
    public List<WallMountedMaterials> getWallMountedMaterialsByName(@RequestParam String name) {
        return wall_mountedService.getWallMountedMaterialsByName(name);
    }
}
