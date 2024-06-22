package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Bottoms;
import com.ecnudbcourse.acnhdb.mapper.BottomsMapper;
import com.ecnudbcourse.acnhdb.dto.BottomsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BottomsService {

    @Autowired
    private BottomsMapper bottomsMapper;

    public List<Bottoms> findByName(String name) { return bottomsMapper.findByName(name); }

    public int insertBottoms(Bottoms bottoms) { return bottomsMapper.insertBottoms(bottoms); }

    public int updateBottoms(Bottoms bottoms) { return bottomsMapper.updateBottoms(bottoms); }

    public int deleteById(Long id) { return bottomsMapper.deleteById(id); }

    public List<Bottoms> getAll() { return bottomsMapper.selectList(null); }

    public Bottoms getById(Long id) { return bottomsMapper.selectById(id); }


    public List<Bottoms> searchBottomsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return bottomsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Bottoms> searchBottomsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return bottomsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Bottoms> searchBottomsByVariation(String variation) {
        return bottomsMapper.findByVariation(variation);
    }

    public List<Bottoms> searchBottomsByDiy(String diy) {
        return bottomsMapper.findByDiy(diy);
    }

    public List<Bottoms> searchBottomsByColor1(String color1) {
        return bottomsMapper.findByColor1(color1);
    }

    public List<Bottoms> searchBottomsByColor2(String color2) {
        return bottomsMapper.findByColor2(color2);
    }

    public List<Bottoms> searchBottomsBySource(String source) {
        return bottomsMapper.findBySource(source);
    }

    public List<Bottoms> searchBottomsBySourceNotes(String sourceNotes) {
        return bottomsMapper.findBySourceNotes(sourceNotes);
    }

    public List<Bottoms> searchBottomsBySeasonalAvailability(String seasonalAvailability) {
        return bottomsMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<Bottoms> searchBottomsByMannequinPiece(String mannequinPiece) {
        return bottomsMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<Bottoms> searchBottomsByStyle(String style) {
        return bottomsMapper.findByStyle(style);
    }

    public List<Bottoms> searchBottomsByLabelThemes(String labelThemes) {
        return bottomsMapper.findByLabelThemes(labelThemes);
    }

    public List<Bottoms> searchBottomsByCatalog(String catalog) {
        return bottomsMapper.findByCatalog(catalog);
    }

    public List<BottomsMaterials> getBottomsMaterialsByName(String name) {
        List<BottomsMaterials> materials = bottomsMapper.selectBottomsMaterialsByName(name);
        Set<BottomsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
