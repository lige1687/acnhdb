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


    @GetMapping("/searchNumberOfMaterial1")
    public List<Recipes> searchRecipesByNumberOfMaterial1(@RequestParam(required = false) String numberOfMaterial1) {
        return recipesService.searchRecipesByNumberOfMaterial1(numberOfMaterial1);
    }

    @GetMapping("/searchMaterial1")
    public List<Recipes> searchRecipesByMaterial1(@RequestParam(required = false) String material1) {
        return recipesService.searchRecipesByMaterial1(material1);
    }

    @GetMapping("/searchNumberOfMaterial2")
    public List<Recipes> searchRecipesByNumberOfMaterial2(@RequestParam(required = false) String numberOfMaterial2) {
        return recipesService.searchRecipesByNumberOfMaterial2(numberOfMaterial2);
    }

    @GetMapping("/searchMaterial2")
    public List<Recipes> searchRecipesByMaterial2(@RequestParam(required = false) String material2) {
        return recipesService.searchRecipesByMaterial2(material2);
    }

    @GetMapping("/searchNumberOfMaterial3")
    public List<Recipes> searchRecipesByNumberOfMaterial3(@RequestParam(required = false) String numberOfMaterial3) {
        return recipesService.searchRecipesByNumberOfMaterial3(numberOfMaterial3);
    }

    @GetMapping("/searchMaterial3")
    public List<Recipes> searchRecipesByMaterial3(@RequestParam(required = false) String material3) {
        return recipesService.searchRecipesByMaterial3(material3);
    }

    @GetMapping("/searchNumberOfMaterial4")
    public List<Recipes> searchRecipesByNumberOfMaterial4(@RequestParam(required = false) String numberOfMaterial4) {
        return recipesService.searchRecipesByNumberOfMaterial4(numberOfMaterial4);
    }

    @GetMapping("/searchMaterial4")
    public List<Recipes> searchRecipesByMaterial4(@RequestParam(required = false) String material4) {
        return recipesService.searchRecipesByMaterial4(material4);
    }

    @GetMapping("/searchNumberOfMaterial5")
    public List<Recipes> searchRecipesByNumberOfMaterial5(@RequestParam(required = false) String numberOfMaterial5) {
        return recipesService.searchRecipesByNumberOfMaterial5(numberOfMaterial5);
    }

    @GetMapping("/searchMaterial5")
    public List<Recipes> searchRecipesByMaterial5(@RequestParam(required = false) String material5) {
        return recipesService.searchRecipesByMaterial5(material5);
    }

    @GetMapping("/searchNumberOfMaterial6")
    public List<Recipes> searchRecipesByNumberOfMaterial6(@RequestParam(required = false) String numberOfMaterial6) {
        return recipesService.searchRecipesByNumberOfMaterial6(numberOfMaterial6);
    }

    @GetMapping("/searchMaterial6")
    public List<Recipes> searchRecipesByMaterial6(@RequestParam(required = false) String material6) {
        return recipesService.searchRecipesByMaterial6(material6);
    }

    @GetMapping("/searchRecipesToUnlock")
    public List<Recipes> searchRecipesByRecipesToUnlock(@RequestParam(required = false) String recipesToUnlock) {
        return recipesService.searchRecipesByRecipesToUnlock(recipesToUnlock);
    }

    @GetMapping("/searchCategory")
    public List<Recipes> searchRecipesByCategory(@RequestParam(required = false) String category) {
        return recipesService.searchRecipesByCategory(category);
    }
}
