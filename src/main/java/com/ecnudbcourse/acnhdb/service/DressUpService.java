package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.DressUp;
import com.ecnudbcourse.acnhdb.mapper.DressUpMapper;
import com.ecnudbcourse.acnhdb.dto.DressUpMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DressUpService {

    @Autowired
    private DressUpMapper dress_upMapper;

    public List<DressUp> findByName(String name) { return dress_upMapper.findByName(name); }

    public int insertDressUp(DressUp dress_up) { return dress_upMapper.insertDressUp(dress_up); }

    public int updateDressUp(DressUp dress_up) { return dress_upMapper.updateDressUp(dress_up); }

    public int deleteById(Long id) { return dress_upMapper.deleteById(id); }

    public List<DressUp> getAll() { return dress_upMapper.selectList(null); }

    public DressUp getById(Long id) { return dress_upMapper.selectById(id); }


    public List<DressUp> searchDressUpByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return dress_upMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<DressUp> searchDressUpBySellRangeAndSort(Integer min, Integer max, String sort) {
        return dress_upMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<DressUp> searchDressUpByVariation(String variation) {
        return dress_upMapper.findByVariation(variation);
    }

    public List<DressUp> searchDressUpByDiy(String diy) {
        return dress_upMapper.findByDiy(diy);
    }

    public List<DressUp> searchDressUpByColor1(String color1) {
        return dress_upMapper.findByColor1(color1);
    }

    public List<DressUp> searchDressUpByColor2(String color2) {
        return dress_upMapper.findByColor2(color2);
    }

    public List<DressUp> searchDressUpBySource(String source) {
        return dress_upMapper.findBySource(source);
    }

    public List<DressUp> searchDressUpBySourceNotes(String sourceNotes) {
        return dress_upMapper.findBySourceNotes(sourceNotes);
    }

    public List<DressUp> searchDressUpBySeasonalAvailability(String seasonalAvailability) {
        return dress_upMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<DressUp> searchDressUpByMannequinPiece(String mannequinPiece) {
        return dress_upMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<DressUp> searchDressUpByStyle(String style) {
        return dress_upMapper.findByStyle(style);
    }

    public List<DressUp> searchDressUpByLabelThemes(String labelThemes) {
        return dress_upMapper.findByLabelThemes(labelThemes);
    }

    public List<DressUp> searchDressUpByCatalog(String catalog) {
        return dress_upMapper.findByCatalog(catalog);
    }

    public List<DressUp> searchDressUpByPrimaryShape(String primaryShape) {
        return dress_upMapper.findByPrimaryShape(primaryShape);
    }

    public List<DressUp> searchDressUpBySecondaryShape(String secondaryShape) {
        return dress_upMapper.findBySecondaryShape(secondaryShape);
    }

    public List<DressUpMaterials> getDressUpMaterialsByName(String name) {
        List<DressUpMaterials> materials = dress_upMapper.selectDressUpMaterialsByName(name);
        Set<DressUpMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
