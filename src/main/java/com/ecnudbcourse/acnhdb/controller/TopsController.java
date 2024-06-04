package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Tops;
import com.ecnudbcourse.acnhdb.service.TopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tops")
public class TopsController {

    @Autowired
    private TopsService topsService;

    @GetMapping
    public List<Tops> getAll() { return topsService.getAll(); }

    @GetMapping("/{id}")
    public Tops getById(@PathVariable Long id) { return topsService.getById(id); }

    @GetMapping("/findByName")
    public List<Tops> findByName(@RequestParam String name) { return topsService.findByName(name); }

}
