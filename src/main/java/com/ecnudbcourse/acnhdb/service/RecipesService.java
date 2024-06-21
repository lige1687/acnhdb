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

}
