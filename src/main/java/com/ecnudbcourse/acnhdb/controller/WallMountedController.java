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

    @GetMapping("/searchVariation")
    public List<WallMounted> searchWallMountedByVariation(@RequestParam(required = false) String variation) {
        return wall_mountedService.searchWallMountedByVariation(variation);
    }

    @GetMapping("/searchBodyTitle")
    public List<WallMounted> searchWallMountedByBodyTitle(@RequestParam(required = false) String bodyTitle) {
        return wall_mountedService.searchWallMountedByBodyTitle(bodyTitle);
    }

    @GetMapping("/searchPattern")
    public List<WallMounted> searchWallMountedByPattern(@RequestParam(required = false) String pattern) {
        return wall_mountedService.searchWallMountedByPattern(pattern);
    }

    @GetMapping("/searchPatternTitle")
    public List<WallMounted> searchWallMountedByPatternTitle(@RequestParam(required = false) String patternTitle) {
        return wall_mountedService.searchWallMountedByPatternTitle(patternTitle);
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

    @GetMapping("/searchColor1")
    public List<WallMounted> searchWallMountedByColor1(@RequestParam(required = false) String color1) {
        return wall_mountedService.searchWallMountedByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<WallMounted> searchWallMountedByColor2(@RequestParam(required = false) String color2) {
        return wall_mountedService.searchWallMountedByColor2(color2);
    }

    @GetMapping("/searchSize")
    public List<WallMounted> searchWallMountedBySize(@RequestParam(required = false) String size) {
        return wall_mountedService.searchWallMountedBySize(size);
    }

    @GetMapping("/searchSource")
    public List<WallMounted> searchWallMountedBySource(@RequestParam(required = false) String source) {
        return wall_mountedService.searchWallMountedBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<WallMounted> searchWallMountedBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return wall_mountedService.searchWallMountedBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchHhaConcept1")
    public List<WallMounted> searchWallMountedByHhaConcept1(@RequestParam(required = false) String hhaConcept1) {
        return wall_mountedService.searchWallMountedByHhaConcept1(hhaConcept1);
    }

    @GetMapping("/searchHhaConcept2")
    public List<WallMounted> searchWallMountedByHhaConcept2(@RequestParam(required = false) String hhaConcept2) {
        return wall_mountedService.searchWallMountedByHhaConcept2(hhaConcept2);
    }

    @GetMapping("/searchHhaSeries")
    public List<WallMounted> searchWallMountedByHhaSeries(@RequestParam(required = false) String hhaSeries) {
        return wall_mountedService.searchWallMountedByHhaSeries(hhaSeries);
    }

    @GetMapping("/searchHhaSet")
    public List<WallMounted> searchWallMountedByHhaSet(@RequestParam(required = false) String hhaSet) {
        return wall_mountedService.searchWallMountedByHhaSet(hhaSet);
    }

    @GetMapping("/searchInteract")
    public List<WallMounted> searchWallMountedByInteract(@RequestParam(required = false) String interact) {
        return wall_mountedService.searchWallMountedByInteract(interact);
    }

    @GetMapping("/searchTag")
    public List<WallMounted> searchWallMountedByTag(@RequestParam(required = false) String tag) {
        return wall_mountedService.searchWallMountedByTag(tag);
    }

    @GetMapping("/searchLightingType")
    public List<WallMounted> searchWallMountedByLightingType(@RequestParam(required = false) String lightingType) {
        return wall_mountedService.searchWallMountedByLightingType(lightingType);
    }

    @GetMapping("/searchDoorDeco")
    public List<WallMounted> searchWallMountedByDoorDeco(@RequestParam(required = false) String doorDeco) {
        return wall_mountedService.searchWallMountedByDoorDeco(doorDeco);
    }

    @GetMapping("/searchCatalog")
    public List<WallMounted> searchWallMountedByCatalog(@RequestParam(required = false) String catalog) {
        return wall_mountedService.searchWallMountedByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<WallMountedMaterials> getWallMountedMaterialsByName(@RequestParam String name) {
        return wall_mountedService.getWallMountedMaterialsByName(name);
    }
}
