package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Housewares;
import com.ecnudbcourse.acnhdb.mapper.HousewaresMapper;
import com.ecnudbcourse.acnhdb.dto.HousewaresMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HousewaresService {

    @Autowired
    private HousewaresMapper housewaresMapper;

    public List<Housewares> findByName(String name) { return housewaresMapper.findByName(name); }

    public int insertHousewares(Housewares housewares) { return housewaresMapper.insertHousewares(housewares); }

    public int updateHousewares(Housewares housewares) { return housewaresMapper.updateHousewares(housewares); }

    public int deleteById(Long id) { return housewaresMapper.deleteById(id); }

    public List<Housewares> getAll() { return housewaresMapper.selectList(null); }

    public Housewares getById(Long id) { return housewaresMapper.selectById(id); }


    public List<Housewares> searchHousewaresByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return housewaresMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Housewares> searchHousewaresByBuyPriceRangeAndSort(Integer min, Integer max, String sort) {
        return housewaresMapper.searchByBuyPriceRangeAndSort(min, max, sort);
    }

    public List<Housewares> searchHousewaresBySellPriceRangeAndSort(Integer min, Integer max, String sort) {
        return housewaresMapper.searchBySellPriceRangeAndSort(min, max, sort);
    }

    public List<Housewares> searchHousewaresByKitCostRangeAndSort(Integer min, Integer max, String sort) {
        return housewaresMapper.searchByKitCostRangeAndSort(min, max, sort);
    }

    public List<Housewares> searchHousewaresByDiy(String diy) {
        return housewaresMapper.findByDiy(diy);
    }

    public List<Housewares> searchHousewaresByBodyCustomize(String bodyCustomize) {
        return housewaresMapper.findByBodyCustomize(bodyCustomize);
    }

    public List<Housewares> searchHousewaresByPatternCustomize(String patternCustomize) {
        return housewaresMapper.findByPatternCustomize(patternCustomize);
    }

    public List<Housewares> searchHousewaresByInteract(String interact) {
        return housewaresMapper.findByInteract(interact);
    }

    public List<Housewares> searchHousewaresByOutdoor(String outdoor) {
        return housewaresMapper.findByOutdoor(outdoor);
    }

    public List<HousewaresMaterials> getHousewaresMaterialsByName(String name) {
        List<HousewaresMaterials> materials = housewaresMapper.selectHousewaresMaterialsByName(name);
        Set<HousewaresMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
