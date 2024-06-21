package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Accessories;
import com.ecnudbcourse.acnhdb.mapper.AccessoriesMapper;
import com.ecnudbcourse.acnhdb.dto.AccessoriesMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccessoriesService {

    @Autowired
    private AccessoriesMapper accessoriesMapper;

    public List<Accessories> findByName(String name) { return accessoriesMapper.findByName(name); }

    public int insertAccessories(Accessories accessories) { return accessoriesMapper.insertAccessories(accessories); }

    public int updateAccessories(Accessories accessories) { return accessoriesMapper.updateAccessories(accessories); }

    public int deleteById(Long id) { return accessoriesMapper.deleteById(id); }

    public List<Accessories> getAll() { return accessoriesMapper.selectList(null); }

    public Accessories getById(Long id) { return accessoriesMapper.selectById(id); }


    public List<Accessories> searchAccessoriesByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return accessoriesMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Accessories> searchAccessoriesBySellRangeAndSort(Integer min, Integer max, String sort) {
        return accessoriesMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Accessories> searchAccessoriesByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return accessoriesMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Accessories> searchAccessoriesByDiy(String diy) {
        return accessoriesMapper.findByDiy(diy);
    }

    public List<AccessoriesMaterials> getAccessoriesMaterialsByName(String name) {
        List<AccessoriesMaterials> materials = accessoriesMapper.selectAccessoriesMaterialsByName(name);
        Set<AccessoriesMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
