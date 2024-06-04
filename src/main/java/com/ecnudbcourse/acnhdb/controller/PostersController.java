package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Posters;
import com.ecnudbcourse.acnhdb.service.PostersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/posters")
public class PostersController {

    @Autowired
    private PostersService postersService;

    @GetMapping
    public List<Posters> getAll() { return postersService.getAll(); }

    @GetMapping("/{id}")
    public Posters getById(@PathVariable Long id) { return postersService.getById(id); }

    @GetMapping("/findByName")
    public List<Posters> findByName(@RequestParam String name) { return postersService.findByName(name); }

}
