package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Reactions;
import com.ecnudbcourse.acnhdb.service.ReactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/reactions")
public class ReactionsController {

    @Autowired
    private ReactionsService reactionsService;

    @GetMapping
    public List<Reactions> getAll() { return reactionsService.getAll(); }

    @GetMapping("/{id}")
    public Reactions getById(@PathVariable Long id) { return reactionsService.getById(id); }

    @GetMapping("/findByName")
    public List<Reactions> findByName(@RequestParam String name) { return reactionsService.findByName(name); }

}
