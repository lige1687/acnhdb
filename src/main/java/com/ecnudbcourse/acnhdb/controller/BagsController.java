package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Bags;
import com.ecnudbcourse.acnhdb.service.BagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bags")
public class BagsController {

    @Autowired
    private BagsService bagsService;

    @GetMapping
    public List<Bags> getAll() { return bagsService.getAll(); }

    @GetMapping("/{id}")
    public Bags getById(@PathVariable Long id) { return bagsService.getById(id); }

    @GetMapping("/findByName")
    public List<Bags> findByName(@RequestParam String name) { return bagsService.findByName(name); }

}
