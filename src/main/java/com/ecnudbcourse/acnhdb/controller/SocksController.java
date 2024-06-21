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
}
