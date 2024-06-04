package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Insects;
import com.ecnudbcourse.acnhdb.service.InsectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/insects")
public class InsectsController {

    @Autowired
    private InsectsService insectsService;

    @GetMapping
    public List<Insects> getAll() { return insectsService.getAll(); }

    @GetMapping("/{id}")
    public Insects getById(@PathVariable Long id) { return insectsService.getById(id); }

    @GetMapping("/findByName")
    public List<Insects> findByName(@RequestParam String name) { return insectsService.findByName(name); }

}
