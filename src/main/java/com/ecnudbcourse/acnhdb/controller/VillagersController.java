package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Villagers;
import com.ecnudbcourse.acnhdb.service.VillagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/villagers")
public class VillagersController {

    @Autowired
    private VillagersService villagersService;

    @GetMapping
    public List<Villagers> getAll() { return villagersService.getAll(); }

    @GetMapping("/{id}")
    public Villagers getById(@PathVariable Long id) { return villagersService.getById(id); }

    @GetMapping("/findByName")
    public List<Villagers> findByName(@RequestParam String name) { return villagersService.findByName(name); }

}
