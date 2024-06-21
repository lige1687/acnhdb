package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Bottoms;
import com.ecnudbcourse.acnhdb.mapper.BottomsMapper;
import com.ecnudbcourse.acnhdb.dto.BottomsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BottomsService {

    @Autowired
    private BottomsMapper bottomsMapper;

    public List<Bottoms> findByName(String name) { return bottomsMapper.findByName(name); }

    public int insertBottoms(Bottoms bottoms) { return bottomsMapper.insertBottoms(bottoms); }

    public int updateBottoms(Bottoms bottoms) { return bottomsMapper.updateBottoms(bottoms); }

    public int deleteById(Long id) { return bottomsMapper.deleteById(id); }

    public List<Bottoms> getAll() { return bottomsMapper.selectList(null); }

    public Bottoms getById(Long id) { return bottomsMapper.selectById(id); }


    public List<Bottoms> searchBottomsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return bottomsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Bottoms> searchBottomsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return bottomsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Bottoms> searchBottomsByDiy(String diy) {
        return bottomsMapper.findByDiy(diy);
    }

    public List<BottomsMaterials> getBottomsMaterialsByName(String name) {
        List<BottomsMaterials> materials = bottomsMapper.selectBottomsMaterialsByName(name);
        Set<BottomsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
