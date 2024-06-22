package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Tools;
import com.ecnudbcourse.acnhdb.service.ToolsService;
import com.ecnudbcourse.acnhdb.dto.ToolsMaterials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/tools")
public class ToolsController {

    @Autowired
    private ToolsService toolsService;

    @GetMapping
    public List<Tools> getAll() { return toolsService.getAll(); }

    @GetMapping("/{id}")
    public Tools getById(@PathVariable Long id) { return toolsService.getById(id); }

    @GetMapping("/findByName")
    public List<Tools> findByName(@RequestParam String name) { return toolsService.findByName(name); }


    @GetMapping("/searchBuy")
    public List<Tools> searchToolsByBuyRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return toolsService.searchToolsByBuyRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchSell")
    public List<Tools> searchToolsBySellRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return toolsService.searchToolsBySellRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchMilesPrice")
    public List<Tools> searchToolsByMilesPriceRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return toolsService.searchToolsByMilesPriceRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchKitCost")
    public List<Tools> searchToolsByKitCostRangeAndSort(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max,
            @RequestParam(required = false) String sort) {

        if (!Objects.equals(sort, "") && !sort.equalsIgnoreCase("asc") && !sort.equalsIgnoreCase("desc")) {
            throw new IllegalArgumentException("Invalid sort parameter. Must be 'asc' or 'desc'.");
        }

        return toolsService.searchToolsByKitCostRangeAndSort(min, max, sort);
    }

    @GetMapping("/searchVariation")
    public List<Tools> searchToolsByVariation(@RequestParam(required = false) String variation) {
        return toolsService.searchToolsByVariation(variation);
    }

    @GetMapping("/searchBodyTitle")
    public List<Tools> searchToolsByBodyTitle(@RequestParam(required = false) String bodyTitle) {
        return toolsService.searchToolsByBodyTitle(bodyTitle);
    }

    @GetMapping("/searchDiy")
    public List<Tools> searchToolsByDiy(@RequestParam(required = false) String diy) {
        return toolsService.searchToolsByDiy(diy);
    }

    @GetMapping("/searchCustomize")
    public List<Tools> searchToolsByCustomize(@RequestParam(required = false) String customize) {
        return toolsService.searchToolsByCustomize(customize);
    }

    @GetMapping("/searchUses")
    public List<Tools> searchToolsByUses(@RequestParam(required = false) String uses) {
        return toolsService.searchToolsByUses(uses);
    }

    @GetMapping("/searchStackSize")
    public List<Tools> searchToolsByStackSize(@RequestParam(required = false) String stackSize) {
        return toolsService.searchToolsByStackSize(stackSize);
    }

    @GetMapping("/searchToolSet")
    public List<Tools> searchToolsByToolSet(@RequestParam(required = false) String toolSet) {
        return toolsService.searchToolsByToolSet(toolSet);
    }

    @GetMapping("/searchSource")
    public List<Tools> searchToolsBySource(@RequestParam(required = false) String source) {
        return toolsService.searchToolsBySource(source);
    }

    @GetMapping("/searchSourceNotes")
    public List<Tools> searchToolsBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return toolsService.searchToolsBySourceNotes(sourceNotes);
    }

    @GetMapping("/materials")
    public List<ToolsMaterials> getToolsMaterialsByName(@RequestParam String name) {
        return toolsService.getToolsMaterialsByName(name);
    }
}
