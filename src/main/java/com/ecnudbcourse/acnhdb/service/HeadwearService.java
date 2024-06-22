package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Headwear;
import com.ecnudbcourse.acnhdb.mapper.HeadwearMapper;
import com.ecnudbcourse.acnhdb.dto.HeadwearMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HeadwearService {

    @Autowired
    private HeadwearMapper headwearMapper;

    public List<Headwear> findByName(String name) { return headwearMapper.findByName(name); }

    public int insertHeadwear(Headwear headwear) { return headwearMapper.insertHeadwear(headwear); }

    public int updateHeadwear(Headwear headwear) { return headwearMapper.updateHeadwear(headwear); }

    public int deleteById(Long id) { return headwearMapper.deleteById(id); }

    public List<Headwear> getAll() { return headwearMapper.selectList(null); }

    public Headwear getById(Long id) { return headwearMapper.selectById(id); }


    public List<Headwear> searchHeadwearByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return headwearMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Headwear> searchHeadwearBySellRangeAndSort(Integer min, Integer max, String sort) {
        return headwearMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Headwear> searchHeadwearByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return headwearMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Headwear> searchHeadwearByVariation(String variation) {
        return headwearMapper.findByVariation(variation);
    }

    public List<Headwear> searchHeadwearByDiy(String diy) {
        return headwearMapper.findByDiy(diy);
    }

    public List<Headwear> searchHeadwearByColor1(String color1) {
        return headwearMapper.findByColor1(color1);
    }

    public List<Headwear> searchHeadwearByColor2(String color2) {
        return headwearMapper.findByColor2(color2);
    }

    public List<Headwear> searchHeadwearBySource(String source) {
        return headwearMapper.findBySource(source);
    }

    public List<Headwear> searchHeadwearBySourceNotes(String sourceNotes) {
        return headwearMapper.findBySourceNotes(sourceNotes);
    }

    public List<Headwear> searchHeadwearBySeasonalAvailability(String seasonalAvailability) {
        return headwearMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<Headwear> searchHeadwearByMannequinPiece(String mannequinPiece) {
        return headwearMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<Headwear> searchHeadwearByStyle(String style) {
        return headwearMapper.findByStyle(style);
    }

    public List<Headwear> searchHeadwearByLabelThemes(String labelThemes) {
        return headwearMapper.findByLabelThemes(labelThemes);
    }

    public List<Headwear> searchHeadwearByType(String type) {
        return headwearMapper.findByType(type);
    }

    public List<Headwear> searchHeadwearByVillagerEquippable(String villagerEquippable) {
        return headwearMapper.findByVillagerEquippable(villagerEquippable);
    }

    public List<Headwear> searchHeadwearByCatalog(String catalog) {
        return headwearMapper.findByCatalog(catalog);
    }

    public List<HeadwearMaterials> getHeadwearMaterialsByName(String name) {
        List<HeadwearMaterials> materials = headwearMapper.selectHeadwearMaterialsByName(name);
        Set<HeadwearMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
