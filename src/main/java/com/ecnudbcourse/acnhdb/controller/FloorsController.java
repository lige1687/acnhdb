package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Floors;
import com.ecnudbcourse.acnhdb.service.FloorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/floors")
public class FloorsController {

    @Autowired
    private FloorsService floorsService;

    @GetMapping
    public List<Floors> getAll() { return floorsService.getAll(); }

    @GetMapping("/{id}")
    public Floors getById(@PathVariable Long id) { return floorsService.getById(id); }

    @GetMapping("/findByName")
    public List<Floors> findByName(@RequestParam String name) { return floorsService.findByName(name); }

}
