package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Bags;
import com.ecnudbcourse.acnhdb.mapper.BagsMapper;
import com.ecnudbcourse.acnhdb.dto.BagsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BagsService {

    @Autowired
    private BagsMapper bagsMapper;

    public List<Bags> findByName(String name) { return bagsMapper.findByName(name); }

    public int insertBags(Bags bags) { return bagsMapper.insertBags(bags); }

    public int updateBags(Bags bags) { return bagsMapper.updateBags(bags); }

    public int deleteById(Long id) { return bagsMapper.deleteById(id); }

    public List<Bags> getAll() { return bagsMapper.selectList(null); }

    public Bags getById(Long id) { return bagsMapper.selectById(id); }


    public List<Bags> searchBagsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return bagsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Bags> searchBagsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return bagsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Bags> searchBagsByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return bagsMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Bags> searchBagsByVariation(String variation) {
        return bagsMapper.findByVariation(variation);
    }

    public List<Bags> searchBagsByDiy(String diy) {
        return bagsMapper.findByDiy(diy);
    }

    public List<Bags> searchBagsByColor1(String color1) {
        return bagsMapper.findByColor1(color1);
    }

    public List<Bags> searchBagsByColor2(String color2) {
        return bagsMapper.findByColor2(color2);
    }

    public List<Bags> searchBagsBySource(String source) {
        return bagsMapper.findBySource(source);
    }

    public List<Bags> searchBagsByStyle(String style) {
        return bagsMapper.findByStyle(style);
    }

    public List<Bags> searchBagsByLabelThemes(String labelThemes) {
        return bagsMapper.findByLabelThemes(labelThemes);
    }

    public List<Bags> searchBagsByCatalog(String catalog) {
        return bagsMapper.findByCatalog(catalog);
    }

    public List<BagsMaterials> getBagsMaterialsByName(String name) {
        List<BagsMaterials> materials = bagsMapper.selectBagsMaterialsByName(name);
        Set<BagsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
