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

    @GetMapping("/searchInteract")
    public List<Miscellaneous> searchMiscellaneousByInteract(@RequestParam(required = false) String interact) {
        return miscellaneousService.searchMiscellaneousByInteract(interact);
    }

    @GetMapping("/searchOutdoor")
    public List<Miscellaneous> searchMiscellaneousByOutdoor(@RequestParam(required = false) String outdoor) {
        return miscellaneousService.searchMiscellaneousByOutdoor(outdoor);
    }

    @GetMapping("/materials")
    public List<MiscellaneousMaterials> getMiscellaneousMaterialsByName(@RequestParam String name) {
        return miscellaneousService.getMiscellaneousMaterialsByName(name);
    }
}
