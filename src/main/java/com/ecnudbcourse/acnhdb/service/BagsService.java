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

    public List<Bags> searchBagsByDiy(String diy) {
        return bagsMapper.findByDiy(diy);
    }

    public List<BagsMaterials> getBagsMaterialsByName(String name) {
        List<BagsMaterials> materials = bagsMapper.selectBagsMaterialsByName(name);
        Set<BagsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
