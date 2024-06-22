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

    public List<Accessories> searchAccessoriesByVariation(String variation) {
        return accessoriesMapper.findByVariation(variation);
    }

    public List<Accessories> searchAccessoriesByDiy(String diy) {
        return accessoriesMapper.findByDiy(diy);
    }

    public List<Accessories> searchAccessoriesByColor1(String color1) {
        return accessoriesMapper.findByColor1(color1);
    }

    public List<Accessories> searchAccessoriesByColor2(String color2) {
        return accessoriesMapper.findByColor2(color2);
    }

    public List<Accessories> searchAccessoriesBySource(String source) {
        return accessoriesMapper.findBySource(source);
    }

    public List<Accessories> searchAccessoriesBySourceNotes(String sourceNotes) {
        return accessoriesMapper.findBySourceNotes(sourceNotes);
    }

    public List<Accessories> searchAccessoriesBySeasonalAvailability(String seasonalAvailability) {
        return accessoriesMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<Accessories> searchAccessoriesByMannequinPiece(String mannequinPiece) {
        return accessoriesMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<Accessories> searchAccessoriesByStyle(String style) {
        return accessoriesMapper.findByStyle(style);
    }

    public List<Accessories> searchAccessoriesByLabelThemes(String labelThemes) {
        return accessoriesMapper.findByLabelThemes(labelThemes);
    }

    public List<Accessories> searchAccessoriesByType(String type) {
        return accessoriesMapper.findByType(type);
    }

    public List<Accessories> searchAccessoriesByVillagerEquippable(String villagerEquippable) {
        return accessoriesMapper.findByVillagerEquippable(villagerEquippable);
    }

    public List<Accessories> searchAccessoriesByCatalog(String catalog) {
        return accessoriesMapper.findByCatalog(catalog);
    }

    public List<AccessoriesMaterials> getAccessoriesMaterialsByName(String name) {
        List<AccessoriesMaterials> materials = accessoriesMapper.selectAccessoriesMaterialsByName(name);
        Set<AccessoriesMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
