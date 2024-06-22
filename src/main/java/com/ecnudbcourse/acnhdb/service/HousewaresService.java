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

    public List<Housewares> searchHousewaresByVariation(String variation) {
        return housewaresMapper.findByVariation(variation);
    }

    public List<Housewares> searchHousewaresByBodyTitle(String bodyTitle) {
        return housewaresMapper.findByBodyTitle(bodyTitle);
    }

    public List<Housewares> searchHousewaresByPattern(String pattern) {
        return housewaresMapper.findByPattern(pattern);
    }

    public List<Housewares> searchHousewaresByPatternTitle(String patternTitle) {
        return housewaresMapper.findByPatternTitle(patternTitle);
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

    public List<Housewares> searchHousewaresByColor1(String color1) {
        return housewaresMapper.findByColor1(color1);
    }

    public List<Housewares> searchHousewaresByColor2(String color2) {
        return housewaresMapper.findByColor2(color2);
    }

    public List<Housewares> searchHousewaresBySize(String size) {
        return housewaresMapper.findBySize(size);
    }

    public List<Housewares> searchHousewaresByInteract(String interact) {
        return housewaresMapper.findByInteract(interact);
    }

    public List<Housewares> searchHousewaresByTag(String tag) {
        return housewaresMapper.findByTag(tag);
    }

    public List<Housewares> searchHousewaresByOutdoor(String outdoor) {
        return housewaresMapper.findByOutdoor(outdoor);
    }

    public List<Housewares> searchHousewaresBySource(String source) {
        return housewaresMapper.findBySource(source);
    }

    public List<Housewares> searchHousewaresBySourceNotes(String sourceNotes) {
        return housewaresMapper.findBySourceNotes(sourceNotes);
    }

    public List<Housewares> searchHousewaresByHhaConcept1(String hhaConcept1) {
        return housewaresMapper.findByHhaConcept1(hhaConcept1);
    }

    public List<Housewares> searchHousewaresByHhaConcept2(String hhaConcept2) {
        return housewaresMapper.findByHhaConcept2(hhaConcept2);
    }

    public List<Housewares> searchHousewaresByHhaSeries(String hhaSeries) {
        return housewaresMapper.findByHhaSeries(hhaSeries);
    }

    public List<Housewares> searchHousewaresByHhaSet(String hhaSet) {
        return housewaresMapper.findByHhaSet(hhaSet);
    }

    public List<Housewares> searchHousewaresBySpeakerType(String speakerType) {
        return housewaresMapper.findBySpeakerType(speakerType);
    }

    public List<Housewares> searchHousewaresByLightingType(String lightingType) {
        return housewaresMapper.findByLightingType(lightingType);
    }

    public List<HousewaresMaterials> getHousewaresMaterialsByName(String name) {
        List<HousewaresMaterials> materials = housewaresMapper.selectHousewaresMaterialsByName(name);
        Set<HousewaresMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
