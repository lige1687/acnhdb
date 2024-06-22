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

    @GetMapping("/searchVariation")
    public List<DressUp> searchDressUpByVariation(@RequestParam(required = false) String variation) {
        return dress_upService.searchDressUpByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<DressUp> searchDressUpByDiy(@RequestParam(required = false) String diy) {
        return dress_upService.searchDressUpByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<DressUp> searchDressUpByColor1(@RequestParam(required = false) String color1) {
        return dress_upService.searchDressUpByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<DressUp> searchDressUpByColor2(@RequestParam(required = false) String color2) {
        return dress_upService.searchDressUpByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<DressUp> searchDressUpBySource(@RequestParam(required = false) String source) {
        return dress_upService.searchDressUpBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<DressUp> searchDressUpBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return dress_upService.searchDressUpBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<DressUp> searchDressUpBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return dress_upService.searchDressUpBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<DressUp> searchDressUpByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return dress_upService.searchDressUpByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<DressUp> searchDressUpByStyle(@RequestParam(required = false) String style) {
        return dress_upService.searchDressUpByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<DressUp> searchDressUpByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return dress_upService.searchDressUpByLabelThemes(labelThemes);
    }

    @GetMapping("/searchCatalog")
    public List<DressUp> searchDressUpByCatalog(@RequestParam(required = false) String catalog) {
        return dress_upService.searchDressUpByCatalog(catalog);
    }

    @GetMapping("/searchPrimaryShape")
    public List<DressUp> searchDressUpByPrimaryShape(@RequestParam(required = false) String primaryShape) {
        return dress_upService.searchDressUpByPrimaryShape(primaryShape);
    }

    @GetMapping("/searchSecondaryShape")
    public List<DressUp> searchDressUpBySecondaryShape(@RequestParam(required = false) String secondaryShape) {
        return dress_upService.searchDressUpBySecondaryShape(secondaryShape);
    }

    @GetMapping("/materials")
    public List<DressUpMaterials> getDressUpMaterialsByName(@RequestParam String name) {
        return dress_upService.getDressUpMaterialsByName(name);
    }
}
