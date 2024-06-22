package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Miscellaneous;
import com.ecnudbcourse.acnhdb.mapper.MiscellaneousMapper;
import com.ecnudbcourse.acnhdb.dto.MiscellaneousMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MiscellaneousService {

    @Autowired
    private MiscellaneousMapper miscellaneousMapper;

    public List<Miscellaneous> findByName(String name) { return miscellaneousMapper.findByName(name); }

    public int insertMiscellaneous(Miscellaneous miscellaneous) { return miscellaneousMapper.insertMiscellaneous(miscellaneous); }

    public int updateMiscellaneous(Miscellaneous miscellaneous) { return miscellaneousMapper.updateMiscellaneous(miscellaneous); }

    public int deleteById(Long id) { return miscellaneousMapper.deleteById(id); }

    public List<Miscellaneous> getAll() { return miscellaneousMapper.selectList(null); }

    public Miscellaneous getById(Long id) { return miscellaneousMapper.selectById(id); }


    public List<Miscellaneous> searchMiscellaneousByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return miscellaneousMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Miscellaneous> searchMiscellaneousBySellRangeAndSort(Integer min, Integer max, String sort) {
        return miscellaneousMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Miscellaneous> searchMiscellaneousByKitCostRangeAndSort(Integer min, Integer max, String sort) {
        return miscellaneousMapper.searchByKitCostRangeAndSort(min, max, sort);
    }

    public List<Miscellaneous> searchMiscellaneousByVariation(String variation) {
        return miscellaneousMapper.findByVariation(variation);
    }

    public List<Miscellaneous> searchMiscellaneousByBodyTitle(String bodyTitle) {
        return miscellaneousMapper.findByBodyTitle(bodyTitle);
    }

    public List<Miscellaneous> searchMiscellaneousByPattern(String pattern) {
        return miscellaneousMapper.findByPattern(pattern);
    }

    public List<Miscellaneous> searchMiscellaneousByPatternTitle(String patternTitle) {
        return miscellaneousMapper.findByPatternTitle(patternTitle);
    }

    public List<Miscellaneous> searchMiscellaneousByDiy(String diy) {
        return miscellaneousMapper.findByDiy(diy);
    }

    public List<Miscellaneous> searchMiscellaneousByBodyCustomize(String bodyCustomize) {
        return miscellaneousMapper.findByBodyCustomize(bodyCustomize);
    }

    public List<Miscellaneous> searchMiscellaneousByPatternCustomize(String patternCustomize) {
        return miscellaneousMapper.findByPatternCustomize(patternCustomize);
    }

    public List<Miscellaneous> searchMiscellaneousByColor1(String color1) {
        return miscellaneousMapper.findByColor1(color1);
    }

    public List<Miscellaneous> searchMiscellaneousByColor2(String color2) {
        return miscellaneousMapper.findByColor2(color2);
    }

    public List<Miscellaneous> searchMiscellaneousBySize(String size) {
        return miscellaneousMapper.findBySize(size);
    }

    public List<Miscellaneous> searchMiscellaneousBySource(String source) {
        return miscellaneousMapper.findBySource(source);
    }

    public List<Miscellaneous> searchMiscellaneousBySourceNotes(String sourceNotes) {
        return miscellaneousMapper.findBySourceNotes(sourceNotes);
    }

    public List<Miscellaneous> searchMiscellaneousByHhaConcept1(String hhaConcept1) {
        return miscellaneousMapper.findByHhaConcept1(hhaConcept1);
    }

    public List<Miscellaneous> searchMiscellaneousByHhaConcept2(String hhaConcept2) {
        return miscellaneousMapper.findByHhaConcept2(hhaConcept2);
    }

    public List<Miscellaneous> searchMiscellaneousByHhaSeries(String hhaSeries) {
        return miscellaneousMapper.findByHhaSeries(hhaSeries);
    }

    public List<Miscellaneous> searchMiscellaneousByHhaSet(String hhaSet) {
        return miscellaneousMapper.findByHhaSet(hhaSet);
    }

    public List<Miscellaneous> searchMiscellaneousByInteract(String interact) {
        return miscellaneousMapper.findByInteract(interact);
    }

    public List<Miscellaneous> searchMiscellaneousByTag(String tag) {
        return miscellaneousMapper.findByTag(tag);
    }

    public List<Miscellaneous> searchMiscellaneousByOutdoor(String outdoor) {
        return miscellaneousMapper.findByOutdoor(outdoor);
    }

    public List<Miscellaneous> searchMiscellaneousBySpeakerType(String speakerType) {
        return miscellaneousMapper.findBySpeakerType(speakerType);
    }

    public List<Miscellaneous> searchMiscellaneousByLightingType(String lightingType) {
        return miscellaneousMapper.findByLightingType(lightingType);
    }

    public List<Miscellaneous> searchMiscellaneousByCatalog(String catalog) {
        return miscellaneousMapper.findByCatalog(catalog);
    }

    public List<MiscellaneousMaterials> getMiscellaneousMaterialsByName(String name) {
        List<MiscellaneousMaterials> materials = miscellaneousMapper.selectMiscellaneousMaterialsByName(name);
        Set<MiscellaneousMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
