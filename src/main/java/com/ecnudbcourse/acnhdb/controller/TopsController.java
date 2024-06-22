package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Tops;
import com.ecnudbcourse.acnhdb.service.TopsService;
import com.ecnudbcourse.acnhdb.dto.TopsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/tops")
public class TopsController {

    @Autowired
    private TopsService topsService;

    @GetMapping
    public List<Tops> getAll() { return topsService.getAll(); }

    @GetMapping("/{id}")
    public Tops getById(@PathVariable Long id) { return topsService.getById(id); }

    @GetMapping("/findByName")
    public List<Tops> findByName(@RequestParam String name) { return topsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Tops> searchTopsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return topsService.searchTopsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Tops> searchTopsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return topsService.searchTopsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Tops> searchTopsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return topsService.searchTopsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Tops> searchTopsByVariation(@RequestParam(required = false) String variation) {
        return topsService.searchTopsByVariation(variation);
    }

    @GetMapping("/searchDiy")
    public List<Tops> searchTopsByDiy(@RequestParam(required = false) String diy) {
        return topsService.searchTopsByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Tops> searchTopsByColor1(@RequestParam(required = false) String color1) {
        return topsService.searchTopsByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Tops> searchTopsByColor2(@RequestParam(required = false) String color2) {
        return topsService.searchTopsByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Tops> searchTopsBySource(@RequestParam(required = false) String source) {
        return topsService.searchTopsBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Tops> searchTopsBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return topsService.searchTopsBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<Tops> searchTopsBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return topsService.searchTopsBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<Tops> searchTopsByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return topsService.searchTopsByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<Tops> searchTopsByStyle(@RequestParam(required = false) String style) {
        return topsService.searchTopsByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Tops> searchTopsByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return topsService.searchTopsByLabelThemes(labelThemes);
    }

    @GetMapping("/searchCatalog")
    public List<Tops> searchTopsByCatalog(@RequestParam(required = false) String catalog) {
        return topsService.searchTopsByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<TopsMaterials> getTopsMaterialsByName(@RequestParam String name) {
        return topsService.getTopsMaterialsByName(name);
    }
}
