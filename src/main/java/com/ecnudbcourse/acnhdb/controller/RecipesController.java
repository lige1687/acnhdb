package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Recipes;
import com.ecnudbcourse.acnhdb.service.RecipesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/recipes")
public class RecipesController {

    @Autowired
    private RecipesService recipesService;

    @GetMapping
    public List<Recipes> getAll() { return recipesService.getAll(); }

    @GetMapping("/{id}")
    public Recipes getById(@PathVariable Long id) { return recipesService.getById(id); }

    @GetMapping("/findByName")
    public List<Recipes> findByName(@RequestParam String name) { return recipesService.findByName(name); }

}
