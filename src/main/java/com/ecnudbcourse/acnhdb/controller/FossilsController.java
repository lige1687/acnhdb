package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fossils;
import com.ecnudbcourse.acnhdb.service.FossilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fossils")
public class FossilsController {

    @Autowired
    private FossilsService fossilsService;

    @GetMapping
    public List<Fossils> getAll() { return fossilsService.getAll(); }

    @GetMapping("/{id}")
    public Fossils getById(@PathVariable Long id) { return fossilsService.getById(id); }

    @GetMapping("/findByName")
    public List<Fossils> findByName(@RequestParam String name) { return fossilsService.findByName(name); }

}
