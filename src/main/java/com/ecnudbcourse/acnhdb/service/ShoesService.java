package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.mapper.ShoesMapper;
import com.ecnudbcourse.acnhdb.dto.ShoesMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShoesService {

    @Autowired
    private ShoesMapper shoesMapper;

    public List<Shoes> findByName(String name) { return shoesMapper.findByName(name); }

    public int insertShoes(Shoes shoes) { return shoesMapper.insertShoes(shoes); }

    public int updateShoes(Shoes shoes) { return shoesMapper.updateShoes(shoes); }

    public int deleteById(Long id) { return shoesMapper.deleteById(id); }

    public List<Shoes> getAll() { return shoesMapper.selectList(null); }

    public Shoes getById(Long id) { return shoesMapper.selectById(id); }


    public List<Shoes> searchShoesByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return shoesMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Shoes> searchShoesBySellRangeAndSort(Integer min, Integer max, String sort) {
        return shoesMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Shoes> searchShoesByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return shoesMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Shoes> searchShoesByDiy(String diy) {
        return shoesMapper.findByDiy(diy);
    }

    public List<ShoesMaterials> getShoesMaterialsByName(String name) {
        List<ShoesMaterials> materials = shoesMapper.selectShoesMaterialsByName(name);
        Set<ShoesMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
