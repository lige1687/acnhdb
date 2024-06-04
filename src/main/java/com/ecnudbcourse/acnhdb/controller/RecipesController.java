package com.ecnudbcourse.acnhdb.controller;


import com.ecnudbcourse.acnhdb.entity.Recipes;
import com.ecnudbcourse.acnhdb.service.RecipesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipesController {

    @Autowired
    private RecipesService recipesService;

    @GetMapping
    public List<Recipes> getAll() {
        return recipesService.getAll();
    }

    @GetMapping("/{id}")
    public Recipes getById(@PathVariable Long id) {
        return recipesService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Recipes recipes) {
        recipesService.save(recipes);
    }

    @PutMapping
    public void update(@RequestBody Recipes recipes) {
        recipesService.update(recipes);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        recipesService.delete(id);
    }
}
