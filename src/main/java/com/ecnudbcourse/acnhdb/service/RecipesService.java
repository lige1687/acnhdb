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

    public List<Recipes> getAll() {
        return recipesMapper.selectList(null);
    }

    public Recipes getById(Long id) {
        return recipesMapper.selectById(id);
    }

    public void save(Recipes recipes) {
        recipesMapper.insert(recipes);
    }

    public void update(Recipes recipes) {
        recipesMapper.updateById(recipes);
    }

    public void delete(Long id) {
        recipesMapper.deleteById(id);
    }
}
