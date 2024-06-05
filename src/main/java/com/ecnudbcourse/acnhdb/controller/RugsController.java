package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Rugs;
import com.ecnudbcourse.acnhdb.service.RugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rugs")
public class RugsController {

    @Autowired
    private RugsService rugsService;

    @GetMapping
    public List<Rugs> getAll() { return rugsService.getAll(); }

    @GetMapping("/{id}")
    public Rugs getById(@PathVariable Long id) { return rugsService.getById(id); }

    @GetMapping("/findByName")
    public List<Rugs> findByName(@RequestParam String name) { return rugsService.findByName(name); }

}
