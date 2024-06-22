package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Construction;
import com.ecnudbcourse.acnhdb.mapper.ConstructionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConstructionService {

    @Autowired
    private ConstructionMapper constructionMapper;

    public List<Construction> findByName(String name) { return constructionMapper.findByName(name); }

    public int insertConstruction(Construction construction) { return constructionMapper.insertConstruction(construction); }

    public int updateConstruction(Construction construction) { return constructionMapper.updateConstruction(construction); }

    public int deleteById(Long id) { return constructionMapper.deleteById(id); }

    public List<Construction> getAll() { return constructionMapper.selectList(null); }

    public Construction getById(Long id) { return constructionMapper.selectById(id); }


    public List<Construction> searchConstructionByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return constructionMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Construction> searchConstructionByCategory(String category) {
        return constructionMapper.findByCategory(category);
    }

    public List<Construction> searchConstructionBySource(String source) {
        return constructionMapper.findBySource(source);
    }
}
