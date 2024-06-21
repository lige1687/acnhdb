package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Housewares;
import com.ecnudbcourse.acnhdb.service.HousewaresService;
import com.ecnudbcourse.acnhdb.dto.HousewaresMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/housewares")
public class HousewaresController {

    @Autowired
    private HousewaresService housewaresService;

    @GetMapping
    public List<Housewares> getAll() { return housewaresService.getAll(); }

    @GetMapping("/{id}")
    public Housewares getById(@PathVariable Long id) { return housewaresService.getById(id); }

    @GetMapping("/findByName")
    public List<Housewares> findByName(@RequestParam String name) { return housewaresService.findByName(name); }


    @GetMapping("/searchMilesPrice")
    public List<Housewares> searchHousewaresByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return housewaresService.searchHousewaresByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchBuyPrice")
    public List<Housewares> searchHousewaresByBuyPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return housewaresService.searchHousewaresByBuyPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSellPrice")
    public List<Housewares> searchHousewaresBySellPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return housewaresService.searchHousewaresBySellPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchKitCost")
    public List<Housewares> searchHousewaresByKitCostRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return housewaresService.searchHousewaresByKitCostRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Housewares> searchHousewaresByDiy(@RequestParam(required = false) String diy) {
        return housewaresService.searchHousewaresByDiy(diy);
    }

    @GetMapping("/searchBodyCustomize")
    public List<Housewares> searchHousewaresByBodyCustomize(@RequestParam(required = false) String bodyCustomize) {
        return housewaresService.searchHousewaresByBodyCustomize(bodyCustomize);
    }

    @GetMapping("/searchPatternCustomize")
    public List<Housewares> searchHousewaresByPatternCustomize(@RequestParam(required = false) String patternCustomize) {
        return housewaresService.searchHousewaresByPatternCustomize(patternCustomize);
    }

    @GetMapping("/searchInteract")
    public List<Housewares> searchHousewaresByInteract(@RequestParam(required = false) String interact) {
        return housewaresService.searchHousewaresByInteract(interact);
    }

    @GetMapping("/searchOutdoor")
    public List<Housewares> searchHousewaresByOutdoor(@RequestParam(required = false) String outdoor) {
        return housewaresService.searchHousewaresByOutdoor(outdoor);
    }

    @GetMapping("/materials")
    public List<HousewaresMaterials> getHousewaresMaterialsByName(@RequestParam String name) {
        return housewaresService.getHousewaresMaterialsByName(name);
    }
}
