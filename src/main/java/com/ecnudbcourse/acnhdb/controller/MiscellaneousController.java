package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Miscellaneous;
import com.ecnudbcourse.acnhdb.service.MiscellaneousService;
import com.ecnudbcourse.acnhdb.dto.MiscellaneousMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/miscellaneous")
public class MiscellaneousController {

    @Autowired
    private MiscellaneousService miscellaneousService;

    @GetMapping
    public List<Miscellaneous> getAll() { return miscellaneousService.getAll(); }

    @GetMapping("/{id}")
    public Miscellaneous getById(@PathVariable Long id) { return miscellaneousService.getById(id); }

    @GetMapping("/findByName")
    public List<Miscellaneous> findByName(@RequestParam String name) { return miscellaneousService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Miscellaneous> searchMiscellaneousByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return miscellaneousService.searchMiscellaneousByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Miscellaneous> searchMiscellaneousBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return miscellaneousService.searchMiscellaneousBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchKitCost")
    public List<Miscellaneous> searchMiscellaneousByKitCostRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return miscellaneousService.searchMiscellaneousByKitCostRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Miscellaneous> searchMiscellaneousByVariation(@RequestParam(required = false) String variation) {
        return miscellaneousService.searchMiscellaneousByVariation(variation);
    }

    @GetMapping("/searchBodyTitle")
    public List<Miscellaneous> searchMiscellaneousByBodyTitle(@RequestParam(required = false) String bodyTitle) {
        return miscellaneousService.searchMiscellaneousByBodyTitle(bodyTitle);
    }

    @GetMapping("/searchPattern")
    public List<Miscellaneous> searchMiscellaneousByPattern(@RequestParam(required = false) String pattern) {
        return miscellaneousService.searchMiscellaneousByPattern(pattern);
    }

    @GetMapping("/searchPatternTitle")
    public List<Miscellaneous> searchMiscellaneousByPatternTitle(@RequestParam(required = false) String patternTitle) {
        return miscellaneousService.searchMiscellaneousByPatternTitle(patternTitle);
    }

    @GetMapping("/searchDiy")
    public List<Miscellaneous> searchMiscellaneousByDiy(@RequestParam(required = false) String diy) {
        return miscellaneousService.searchMiscellaneousByDiy(diy);
    }

    @GetMapping("/searchBodyCustomize")
    public List<Miscellaneous> searchMiscellaneousByBodyCustomize(@RequestParam(required = false) String bodyCustomize) {
        return miscellaneousService.searchMiscellaneousByBodyCustomize(bodyCustomize);
    }

    @GetMapping("/searchPatternCustomize")
    public List<Miscellaneous> searchMiscellaneousByPatternCustomize(@RequestParam(required = false) String patternCustomize) {
        return miscellaneousService.searchMiscellaneousByPatternCustomize(patternCustomize);
    }

    @GetMapping("/searchColor1")
    public List<Miscellaneous> searchMiscellaneousByColor1(@RequestParam(required = false) String color1) {
        return miscellaneousService.searchMiscellaneousByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Miscellaneous> searchMiscellaneousByColor2(@RequestParam(required = false) String color2) {
        return miscellaneousService.searchMiscellaneousByColor2(color2);
    }

    @GetMapping("/searchSize")
    public List<Miscellaneous> searchMiscellaneousBySize(@RequestParam(required = false) String size) {
        return miscellaneousService.searchMiscellaneousBySize(size);
    }

    @GetMapping("/searchSource")
    public List<Miscellaneous> searchMiscellaneousBySource(@RequestParam(required = false) String source) {
        return miscellaneousService.searchMiscellaneousBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Miscellaneous> searchMiscellaneousBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return miscellaneousService.searchMiscellaneousBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchHhaConcept1")
    public List<Miscellaneous> searchMiscellaneousByHhaConcept1(@RequestParam(required = false) String hhaConcept1) {
        return miscellaneousService.searchMiscellaneousByHhaConcept1(hhaConcept1);
    }

    @GetMapping("/searchHhaConcept2")
    public List<Miscellaneous> searchMiscellaneousByHhaConcept2(@RequestParam(required = false) String hhaConcept2) {
        return miscellaneousService.searchMiscellaneousByHhaConcept2(hhaConcept2);
    }

    @GetMapping("/searchHhaSeries")
    public List<Miscellaneous> searchMiscellaneousByHhaSeries(@RequestParam(required = false) String hhaSeries) {
        return miscellaneousService.searchMiscellaneousByHhaSeries(hhaSeries);
    }

    @GetMapping("/searchHhaSet")
    public List<Miscellaneous> searchMiscellaneousByHhaSet(@RequestParam(required = false) String hhaSet) {
        return miscellaneousService.searchMiscellaneousByHhaSet(hhaSet);
    }

    @GetMapping("/searchInteract")
    public List<Miscellaneous> searchMiscellaneousByInteract(@RequestParam(required = false) String interact) {
        return miscellaneousService.searchMiscellaneousByInteract(interact);
    }

    @GetMapping("/searchTag")
    public List<Miscellaneous> searchMiscellaneousByTag(@RequestParam(required = false) String tag) {
        return miscellaneousService.searchMiscellaneousByTag(tag);
    }

    @GetMapping("/searchOutdoor")
    public List<Miscellaneous> searchMiscellaneousByOutdoor(@RequestParam(required = false) String outdoor) {
        return miscellaneousService.searchMiscellaneousByOutdoor(outdoor);
    }

    @GetMapping("/searchSpeakerType")
    public List<Miscellaneous> searchMiscellaneousBySpeakerType(@RequestParam(required = false) String speakerType) {
        return miscellaneousService.searchMiscellaneousBySpeakerType(speakerType);
    }

    @GetMapping("/searchLightingType")
    public List<Miscellaneous> searchMiscellaneousByLightingType(@RequestParam(required = false) String lightingType) {
        return miscellaneousService.searchMiscellaneousByLightingType(lightingType);
    }

    @GetMapping("/searchCatalog")
    public List<Miscellaneous> searchMiscellaneousByCatalog(@RequestParam(required = false) String catalog) {
        return miscellaneousService.searchMiscellaneousByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<MiscellaneousMaterials> getMiscellaneousMaterialsByName(@RequestParam String name) {
        return miscellaneousService.getMiscellaneousMaterialsByName(name);
    }
}
