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

    @GetMapping("/searchVariation")
    public List<Accessories> searchAccessoriesByVariation(@RequestParam(required = false) String variation) {
        return accessoriesService.searchAccessoriesByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<Accessories> searchAccessoriesByDiy(@RequestParam(required = false) String diy) {
        return accessoriesService.searchAccessoriesByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Accessories> searchAccessoriesByColor1(@RequestParam(required = false) String color1) {
        return accessoriesService.searchAccessoriesByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Accessories> searchAccessoriesByColor2(@RequestParam(required = false) String color2) {
        return accessoriesService.searchAccessoriesByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Accessories> searchAccessoriesBySource(@RequestParam(required = false) String source) {
        return accessoriesService.searchAccessoriesBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Accessories> searchAccessoriesBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return accessoriesService.searchAccessoriesBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<Accessories> searchAccessoriesBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return accessoriesService.searchAccessoriesBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<Accessories> searchAccessoriesByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return accessoriesService.searchAccessoriesByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<Accessories> searchAccessoriesByStyle(@RequestParam(required = false) String style) {
        return accessoriesService.searchAccessoriesByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Accessories> searchAccessoriesByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return accessoriesService.searchAccessoriesByLabelThemes(labelThemes);
    }

    @GetMapping("/searchType")
    public List<Accessories> searchAccessoriesByType(@RequestParam(required = false) String type) {
        return accessoriesService.searchAccessoriesByType(type);
    }

    @GetMapping("/searchVillagerEquippable")
    public List<Accessories> searchAccessoriesByVillagerEquippable(@RequestParam(required = false) String villagerEquippable) {
        return accessoriesService.searchAccessoriesByVillagerEquippable(villagerEquippable);
    }

    @GetMapping("/searchCatalog")
    public List<Accessories> searchAccessoriesByCatalog(@RequestParam(required = false) String catalog) {
        return accessoriesService.searchAccessoriesByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<AccessoriesMaterials> getAccessoriesMaterialsByName(@RequestParam String name) {
        return accessoriesService.getAccessoriesMaterialsByName(name);
    }
}
