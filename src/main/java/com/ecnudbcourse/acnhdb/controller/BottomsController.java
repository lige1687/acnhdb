package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Bottoms;
import com.ecnudbcourse.acnhdb.service.BottomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bottoms")
public class BottomsController {

    @Autowired
    private BottomsService bottomsService;

    @GetMapping
    public List<Bottoms> getAll() { return bottomsService.getAll(); }

    @GetMapping("/{id}")
    public Bottoms getById(@PathVariable Long id) { return bottomsService.getById(id); }

    @GetMapping("/findByName")
    public List<Bottoms> findByName(@RequestParam String name) { return bottomsService.findByName(name); }

}
