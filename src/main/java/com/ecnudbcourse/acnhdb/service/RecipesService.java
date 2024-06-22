package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Recipes;
import com.ecnudbcourse.acnhdb.mapper.RecipesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecipesService {

    @Autowired
    private RecipesMapper recipesMapper;

    public List<Recipes> findByName(String name) { return recipesMapper.findByName(name); }

    public int insertRecipes(Recipes recipes) { return recipesMapper.insertRecipes(recipes); }

    public int updateRecipes(Recipes recipes) { return recipesMapper.updateRecipes(recipes); }

    public int deleteById(Long id) { return recipesMapper.deleteById(id); }

    public List<Recipes> getAll() { return recipesMapper.selectList(null); }

    public Recipes getById(Long id) { return recipesMapper.selectById(id); }


    public List<Recipes> searchRecipesByNumberOfMaterial1(String numberOfMaterial1) {
        return recipesMapper.findByNumberOfMaterial1(numberOfMaterial1);
    }

    public List<Recipes> searchRecipesByMaterial1(String material1) {
        return recipesMapper.findByMaterial1(material1);
    }

    public List<Recipes> searchRecipesByNumberOfMaterial2(String numberOfMaterial2) {
        return recipesMapper.findByNumberOfMaterial2(numberOfMaterial2);
    }

    public List<Recipes> searchRecipesByMaterial2(String material2) {
        return recipesMapper.findByMaterial2(material2);
    }

    public List<Recipes> searchRecipesByNumberOfMaterial3(String numberOfMaterial3) {
        return recipesMapper.findByNumberOfMaterial3(numberOfMaterial3);
    }

    public List<Recipes> searchRecipesByMaterial3(String material3) {
        return recipesMapper.findByMaterial3(material3);
    }

    public List<Recipes> searchRecipesByNumberOfMaterial4(String numberOfMaterial4) {
        return recipesMapper.findByNumberOfMaterial4(numberOfMaterial4);
    }

    public List<Recipes> searchRecipesByMaterial4(String material4) {
        return recipesMapper.findByMaterial4(material4);
    }

    public List<Recipes> searchRecipesByNumberOfMaterial5(String numberOfMaterial5) {
        return recipesMapper.findByNumberOfMaterial5(numberOfMaterial5);
    }

    public List<Recipes> searchRecipesByMaterial5(String material5) {
        return recipesMapper.findByMaterial5(material5);
    }

    public List<Recipes> searchRecipesByNumberOfMaterial6(String numberOfMaterial6) {
        return recipesMapper.findByNumberOfMaterial6(numberOfMaterial6);
    }

    public List<Recipes> searchRecipesByMaterial6(String material6) {
        return recipesMapper.findByMaterial6(material6);
    }

    public List<Recipes> searchRecipesByRecipesToUnlock(String recipesToUnlock) {
        return recipesMapper.findByRecipesToUnlock(recipesToUnlock);
    }

    public List<Recipes> searchRecipesByCategory(String category) {
        return recipesMapper.findByCategory(category);
    }
}
