package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Bottoms;
import com.ecnudbcourse.acnhdb.service.BottomsService;
import com.ecnudbcourse.acnhdb.dto.BottomsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/bottoms")
public class BottomsController {

    @Autowired
    private BottomsService bottomsService;

    @GetMapping
    public List<Bottoms> getAll() { return bottomsService.getAll(); }

    @GetMapping("/{id}")
    public Bottoms getById(@PathVariable Long id) { return bottomsService.getById(id); }

    @GetMapping("/findByName")
    public List<Bottoms> findByName(@RequestParam String name) { return bottomsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Bottoms> searchBottomsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bottomsService.searchBottomsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Bottoms> searchBottomsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return bottomsService.searchBottomsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Bottoms> searchBottomsByVariation(@RequestParam(required = false) String variation) {
        return bottomsService.searchBottomsByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<Bottoms> searchBottomsByDiy(@RequestParam(required = false) String diy) {
        return bottomsService.searchBottomsByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Bottoms> searchBottomsByColor1(@RequestParam(required = false) String color1) {
        return bottomsService.searchBottomsByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Bottoms> searchBottomsByColor2(@RequestParam(required = false) String color2) {
        return bottomsService.searchBottomsByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Bottoms> searchBottomsBySource(@RequestParam(required = false) String source) {
        return bottomsService.searchBottomsBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Bottoms> searchBottomsBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return bottomsService.searchBottomsBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<Bottoms> searchBottomsBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return bottomsService.searchBottomsBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<Bottoms> searchBottomsByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return bottomsService.searchBottomsByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<Bottoms> searchBottomsByStyle(@RequestParam(required = false) String style) {
        return bottomsService.searchBottomsByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Bottoms> searchBottomsByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return bottomsService.searchBottomsByLabelThemes(labelThemes);
    }

    @GetMapping("/searchCatalog")
    public List<Bottoms> searchBottomsByCatalog(@RequestParam(required = false) String catalog) {
        return bottomsService.searchBottomsByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<BottomsMaterials> getBottomsMaterialsByName(@RequestParam String name) {
        return bottomsService.getBottomsMaterialsByName(name);
    }
}
