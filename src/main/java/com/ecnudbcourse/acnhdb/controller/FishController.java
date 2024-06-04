package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Fish;
import com.ecnudbcourse.acnhdb.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fish")
public class FishController {

    @Autowired
    private FishService fishService;

    @GetMapping
    public List<Fish> getAll() { return fishService.getAll(); }

    @GetMapping("/{id}")
    public Fish getById(@PathVariable Long id) { return fishService.getById(id); }

    @GetMapping("/findByName")
    public List<Fish> findByName(@RequestParam String name) { return fishService.findByName(name); }

}
