package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Rugs;
import com.ecnudbcourse.acnhdb.service.RugsService;
import com.ecnudbcourse.acnhdb.dto.RugsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/rugs")
public class RugsController {

    @Autowired
    private RugsService rugsService;

    @GetMapping
    public List<Rugs> getAll() { return rugsService.getAll(); }

    @GetMapping("/{id}")
    public Rugs getById(@PathVariable Long id) { return rugsService.getById(id); }

    @GetMapping("/findByName")
    public List<Rugs> findByName(@RequestParam String name) { return rugsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Rugs> searchRugsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return rugsService.searchRugsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Rugs> searchRugsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return rugsService.searchRugsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Rugs> searchRugsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return rugsService.searchRugsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Rugs> searchRugsByDiy(@RequestParam(required = false) String diy) {
        return rugsService.searchRugsByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Rugs> searchRugsByColor1(@RequestParam(required = false) String color1) {
        return rugsService.searchRugsByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Rugs> searchRugsByColor2(@RequestParam(required = false) String color2) {
        return rugsService.searchRugsByColor2(color2);
    }

    @GetMapping("/searchSize")
    public List<Rugs> searchRugsBySize(@RequestParam(required = false) String size) {
        return rugsService.searchRugsBySize(size);
    }

    @GetMapping("/searchSource")
    public List<Rugs> searchRugsBySource(@RequestParam(required = false) String source) {
        return rugsService.searchRugsBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Rugs> searchRugsBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return rugsService.searchRugsBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchHhaConcept1")
    public List<Rugs> searchRugsByHhaConcept1(@RequestParam(required = false) String hhaConcept1) {
        return rugsService.searchRugsByHhaConcept1(hhaConcept1);
    }

    @GetMapping("/searchHhaConcept2")
    public List<Rugs> searchRugsByHhaConcept2(@RequestParam(required = false) String hhaConcept2) {
        return rugsService.searchRugsByHhaConcept2(hhaConcept2);
    }

    @GetMapping("/searchHhaSeries")
    public List<Rugs> searchRugsByHhaSeries(@RequestParam(required = false) String hhaSeries) {
        return rugsService.searchRugsByHhaSeries(hhaSeries);
    }

    @GetMapping("/searchTag")
    public List<Rugs> searchRugsByTag(@RequestParam(required = false) String tag) {
        return rugsService.searchRugsByTag(tag);
    }

    @GetMapping("/searchCatalog")
    public List<Rugs> searchRugsByCatalog(@RequestParam(required = false) String catalog) {
        return rugsService.searchRugsByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<RugsMaterials> getRugsMaterialsByName(@RequestParam String name) {
        return rugsService.getRugsMaterialsByName(name);
    }
}
