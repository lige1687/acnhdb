package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Tops;
import com.ecnudbcourse.acnhdb.mapper.TopsMapper;
import com.ecnudbcourse.acnhdb.dto.TopsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TopsService {

    @Autowired
    private TopsMapper topsMapper;

    public List<Tops> findByName(String name) { return topsMapper.findByName(name); }

    public int insertTops(Tops tops) { return topsMapper.insertTops(tops); }

    public int updateTops(Tops tops) { return topsMapper.updateTops(tops); }

    public int deleteById(Long id) { return topsMapper.deleteById(id); }

    public List<Tops> getAll() { return topsMapper.selectList(null); }

    public Tops getById(Long id) { return topsMapper.selectById(id); }


    public List<Tops> searchTopsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return topsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Tops> searchTopsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return topsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Tops> searchTopsByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return topsMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Tops> searchTopsByDiy(String diy) {
        return topsMapper.findByDiy(diy);
    }

    public List<TopsMaterials> getTopsMaterialsByName(String name) {
        List<TopsMaterials> materials = topsMapper.selectTopsMaterialsByName(name);
        Set<TopsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
