package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.service.ShoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shoes")
public class ShoesController {

    @Autowired
    private ShoesService shoesService;

    @GetMapping
    public List<Shoes> getAll() { return shoesService.getAll(); }

    @GetMapping("/{id}")
    public Shoes getById(@PathVariable Long id) { return shoesService.getById(id); }

    @GetMapping("/findByName")
    public List<Shoes> findByName(@RequestParam String name) { return shoesService.findByName(name); }

}
