package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Socks;
import com.ecnudbcourse.acnhdb.service.SocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/socks")
public class SocksController {

    @Autowired
    private SocksService socksService;

    @GetMapping
    public List<Socks> getAll() { return socksService.getAll(); }

    @GetMapping("/{id}")
    public Socks getById(@PathVariable Long id) { return socksService.getById(id); }

    @GetMapping("/findByName")
    public List<Socks> findByName(@RequestParam String name) { return socksService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Socks> searchSocksByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return socksService.searchSocksByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Socks> searchSocksBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return socksService.searchSocksBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Socks> searchSocksByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return socksService.searchSocksByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Socks> searchSocksByVariation(@RequestParam(required = false) String variation) {
        return socksService.searchSocksByVariation(variation);
    }

    @GetMapping("/searchColor1")
    public List<Socks> searchSocksByColor1(@RequestParam(required = false) String color1) {
        return socksService.searchSocksByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Socks> searchSocksByColor2(@RequestParam(required = false) String color2) {
        return socksService.searchSocksByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Socks> searchSocksBySource(@RequestParam(required = false) String source) {
        return socksService.searchSocksBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Socks> searchSocksBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return socksService.searchSocksBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchSeasonalAvailability")
    public List<Socks> searchSocksBySeasonalAvailability(@RequestParam(required = false) String seasonalAvailability) {
        return socksService.searchSocksBySeasonalAvailability(seasonalAvailability);
    }

    @GetMapping("/searchMannequinPiece")
    public List<Socks> searchSocksByMannequinPiece(@RequestParam(required = false) String mannequinPiece) {
        return socksService.searchSocksByMannequinPiece(mannequinPiece);
    }

    @GetMapping("/searchStyle")
    public List<Socks> searchSocksByStyle(@RequestParam(required = false) String style) {
        return socksService.searchSocksByStyle(style);
    }

    @GetMapping("/searchLabelThemes")
    public List<Socks> searchSocksByLabelThemes(@RequestParam(required = false) String labelThemes) {
        return socksService.searchSocksByLabelThemes(labelThemes);
    }

    @GetMapping("/searchCatalog")
    public List<Socks> searchSocksByCatalog(@RequestParam(required = false) String catalog) {
        return socksService.searchSocksByCatalog(catalog);
    }
}
