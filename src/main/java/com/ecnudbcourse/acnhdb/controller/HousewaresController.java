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

    @GetMapping("/searchVariation")
    public List<Housewares> searchHousewaresByVariation(@RequestParam(required = false) String variation) {
        return housewaresService.searchHousewaresByVariation(variation);
    }

    @GetMapping("/searchBodyTitle")
    public List<Housewares> searchHousewaresByBodyTitle(@RequestParam(required = false) String bodyTitle) {
        return housewaresService.searchHousewaresByBodyTitle(bodyTitle);
    }

    @GetMapping("/searchPattern")
    public List<Housewares> searchHousewaresByPattern(@RequestParam(required = false) String pattern) {
        return housewaresService.searchHousewaresByPattern(pattern);
    }

    @GetMapping("/searchPatternTitle")
    public List<Housewares> searchHousewaresByPatternTitle(@RequestParam(required = false) String patternTitle) {
        return housewaresService.searchHousewaresByPatternTitle(patternTitle);
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

    @GetMapping("/searchColor1")
    public List<Housewares> searchHousewaresByColor1(@RequestParam(required = false) String color1) {
        return housewaresService.searchHousewaresByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Housewares> searchHousewaresByColor2(@RequestParam(required = false) String color2) {
        return housewaresService.searchHousewaresByColor2(color2);
    }

    @GetMapping("/searchSize")
    public List<Housewares> searchHousewaresBySize(@RequestParam(required = false) String size) {
        return housewaresService.searchHousewaresBySize(size);
    }

    @GetMapping("/searchInteract")
    public List<Housewares> searchHousewaresByInteract(@RequestParam(required = false) String interact) {
        return housewaresService.searchHousewaresByInteract(interact);
    }

    @GetMapping("/searchTag")
    public List<Housewares> searchHousewaresByTag(@RequestParam(required = false) String tag) {
        return housewaresService.searchHousewaresByTag(tag);
    }

    @GetMapping("/searchOutdoor")
    public List<Housewares> searchHousewaresByOutdoor(@RequestParam(required = false) String outdoor) {
        return housewaresService.searchHousewaresByOutdoor(outdoor);
    }

    @GetMapping("/searchSource")
    public List<Housewares> searchHousewaresBySource(@RequestParam(required = false) String source) {
        return housewaresService.searchHousewaresBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Housewares> searchHousewaresBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return housewaresService.searchHousewaresBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchHhaConcept1")
    public List<Housewares> searchHousewaresByHhaConcept1(@RequestParam(required = false) String hhaConcept1) {
        return housewaresService.searchHousewaresByHhaConcept1(hhaConcept1);
    }

    @GetMapping("/searchHhaConcept2")
    public List<Housewares> searchHousewaresByHhaConcept2(@RequestParam(required = false) String hhaConcept2) {
        return housewaresService.searchHousewaresByHhaConcept2(hhaConcept2);
    }

    @GetMapping("/searchHhaSeries")
    public List<Housewares> searchHousewaresByHhaSeries(@RequestParam(required = false) String hhaSeries) {
        return housewaresService.searchHousewaresByHhaSeries(hhaSeries);
    }

    @GetMapping("/searchHhaSet")
    public List<Housewares> searchHousewaresByHhaSet(@RequestParam(required = false) String hhaSet) {
        return housewaresService.searchHousewaresByHhaSet(hhaSet);
    }

    @GetMapping("/searchSpeakerType")
    public List<Housewares> searchHousewaresBySpeakerType(@RequestParam(required = false) String speakerType) {
        return housewaresService.searchHousewaresBySpeakerType(speakerType);
    }

    @GetMapping("/searchLightingType")
    public List<Housewares> searchHousewaresByLightingType(@RequestParam(required = false) String lightingType) {
        return housewaresService.searchHousewaresByLightingType(lightingType);
    }

    @GetMapping("/materials")
    public List<HousewaresMaterials> getHousewaresMaterialsByName(@RequestParam String name) {
        return housewaresService.getHousewaresMaterialsByName(name);
    }
}
