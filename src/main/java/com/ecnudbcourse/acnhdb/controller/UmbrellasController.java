package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Umbrellas;
import com.ecnudbcourse.acnhdb.service.UmbrellasService;
import com.ecnudbcourse.acnhdb.dto.UmbrellasMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/umbrellas")
public class UmbrellasController {

    @Autowired
    private UmbrellasService umbrellasService;

    @GetMapping
    public List<Umbrellas> getAll() { return umbrellasService.getAll(); }

    @GetMapping("/{id}")
    public Umbrellas getById(@PathVariable Long id) { return umbrellasService.getById(id); }

    @GetMapping("/findByName")
    public List<Umbrellas> findByName(@RequestParam String name) { return umbrellasService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Umbrellas> searchUmbrellasByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return umbrellasService.searchUmbrellasByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Umbrellas> searchUmbrellasBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return umbrellasService.searchUmbrellasBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Umbrellas> searchUmbrellasByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return umbrellasService.searchUmbrellasByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchDiy")
    public List<Umbrellas> searchUmbrellasByDiy(@RequestParam(required = false) String diy) {
        return umbrellasService.searchUmbrellasByDiy(diy);
    }

    @GetMapping("/searchColor1")
    public List<Umbrellas> searchUmbrellasByColor1(@RequestParam(required = false) String color1) {
        return umbrellasService.searchUmbrellasByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Umbrellas> searchUmbrellasByColor2(@RequestParam(required = false) String color2) {
        return umbrellasService.searchUmbrellasByColor2(color2);
    }

    @GetMapping("/searchSource")
    public List<Umbrellas> searchUmbrellasBySource(@RequestParam(required = false) String source) {
        return umbrellasService.searchUmbrellasBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Umbrellas> searchUmbrellasBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return umbrellasService.searchUmbrellasBySourceNotes(sourceNotes);
    }

    @GetMapping("/searchCatalog")
    public List<Umbrellas> searchUmbrellasByCatalog(@RequestParam(required = false) String catalog) {
        return umbrellasService.searchUmbrellasByCatalog(catalog);
    }

    @GetMapping("/materials")
    public List<UmbrellasMaterials> getUmbrellasMaterialsByName(@RequestParam String name) {
        return umbrellasService.getUmbrellasMaterialsByName(name);
    }
}
