package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.service.ShoesService;
import com.ecnudbcourse.acnhdb.dto.ShoesMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/shoes")
public class ShoesController {

    @Autowired
    private ShoesService shoesService;

    @GetMapping
    public List<Shoes> getAll() { return shoesService.getAll(); }

    @GetMapping("/{id}")
    public Shoes getById(@PathVariable Long id) { return shoesService.getById(id); }

    @GetMapping("/findByName")
    public List<Shoes> findByName(@RequestParam String name) { return shoesService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Shoes> searchShoesByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return shoesService.searchShoesByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Shoes> searchShoesBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return shoesService.searchShoesBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Shoes> searchShoesByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return shoesService.searchShoesByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Shoes> searchShoesByVariation(@RequestParam(required = false) String variation) {
        return shoesService.searchShoesByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<Shoes> searchShoesByDiy(@RequestParam(required = false) String diy) {
        return shoesService.searchShoesByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Shoes> searchShoesByColor1(@RequestParam(required = false) String color1) {
        return shoesService.searchShoesByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Shoes> searchShoesByColor2(@RequestParam(required = false) String color2) {
        return shoesService.searchShoesByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Shoes> searchShoesBySource(@RequestParam(required = false) String source) {
        return shoesService.searchShoesBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Shoes> searchShoesBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return shoesService.searchShoesBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<Shoes> searchShoesBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return shoesService.searchShoesBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<Shoes> searchShoesByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return shoesService.searchShoesByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<Shoes> searchShoesByStyle(@RequestParam(required = false) String style) {
        return shoesService.searchShoesByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Shoes> searchShoesByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return shoesService.searchShoesByLabelThemes(labelThemes);
    }

    @GetMapping("/searchCatalog")
    public List<Shoes> searchShoesByCatalog(@RequestParam(required = false) String catalog) {
        return shoesService.searchShoesByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<ShoesMaterials> getShoesMaterialsByName(@RequestParam String name) {
        return shoesService.getShoesMaterialsByName(name);
    }
}
