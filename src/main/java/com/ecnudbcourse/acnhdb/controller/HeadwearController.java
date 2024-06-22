package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Headwear;
import com.ecnudbcourse.acnhdb.service.HeadwearService;
import com.ecnudbcourse.acnhdb.dto.HeadwearMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/headwear")
public class HeadwearController {

    @Autowired
    private HeadwearService headwearService;

    @GetMapping
    public List<Headwear> getAll() { return headwearService.getAll(); }

    @GetMapping("/{id}")
    public Headwear getById(@PathVariable Long id) { return headwearService.getById(id); }

    @GetMapping("/findByName")
    public List<Headwear> findByName(@RequestParam String name) { return headwearService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Headwear> searchHeadwearByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return headwearService.searchHeadwearByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Headwear> searchHeadwearBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return headwearService.searchHeadwearBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Headwear> searchHeadwearByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return headwearService.searchHeadwearByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Headwear> searchHeadwearByVariation(@RequestParam(required = false) String variation) {
        return headwearService.searchHeadwearByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<Headwear> searchHeadwearByDiy(@RequestParam(required = false) String diy) {
        return headwearService.searchHeadwearByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Headwear> searchHeadwearByColor1(@RequestParam(required = false) String color1) {
        return headwearService.searchHeadwearByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Headwear> searchHeadwearByColor2(@RequestParam(required = false) String color2) {
        return headwearService.searchHeadwearByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Headwear> searchHeadwearBySource(@RequestParam(required = false) String source) {
        return headwearService.searchHeadwearBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Headwear> searchHeadwearBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return headwearService.searchHeadwearBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<Headwear> searchHeadwearBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return headwearService.searchHeadwearBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<Headwear> searchHeadwearByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return headwearService.searchHeadwearByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<Headwear> searchHeadwearByStyle(@RequestParam(required = false) String style) {
        return headwearService.searchHeadwearByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Headwear> searchHeadwearByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return headwearService.searchHeadwearByLabelThemes(labelThemes);
    }

    @GetMapping("/searchType")
    public List<Headwear> searchHeadwearByType(@RequestParam(required = false) String type) {
        return headwearService.searchHeadwearByType(type);
    }

    @GetMapping("/searchVillagerEquippable")
    public List<Headwear> searchHeadwearByVillagerEquippable(@RequestParam(required = false) String villagerEquippable) {
        return headwearService.searchHeadwearByVillagerEquippable(villagerEquippable);
    }

    @GetMapping("/searchCatalog")
    public List<Headwear> searchHeadwearByCatalog(@RequestParam(required = false) String catalog) {
        return headwearService.searchHeadwearByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<HeadwearMaterials> getHeadwearMaterialsByName(@RequestParam String name) {
        return headwearService.getHeadwearMaterialsByName(name);
    }
}
