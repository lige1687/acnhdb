package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fencing;
import com.ecnudbcourse.acnhdb.service.FencingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fencing")
public class FencingController {

    @Autowired
    private FencingService fencingService;

    @GetMapping
    public List<Fencing> getAll() { return fencingService.getAll(); }

    @GetMapping("/{id}")
    public Fencing getById(@PathVariable Long id) { return fencingService.getById(id); }

    @GetMapping("/findByName")
    public List<Fencing> findByName(@RequestParam String name) { return fencingService.findByName(name); }

}
