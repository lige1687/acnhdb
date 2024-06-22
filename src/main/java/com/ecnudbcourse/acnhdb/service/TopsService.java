package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Tops;
import com.ecnudbcourse.acnhdb.mapper.TopsMapper;
import com.ecnudbcourse.acnhdb.dto.TopsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TopsService {

    @Autowired
    private TopsMapper topsMapper;

    public List<Tops> findByName(String name) { return topsMapper.findByName(name); }

    public int insertTops(Tops tops) { return topsMapper.insertTops(tops); }

    public int updateTops(Tops tops) { return topsMapper.updateTops(tops); }

    public int deleteById(Long id) { return topsMapper.deleteById(id); }

    public List<Tops> getAll() { return topsMapper.selectList(null); }

    public Tops getById(Long id) { return topsMapper.selectById(id); }


    public List<Tops> searchTopsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return topsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Tops> searchTopsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return topsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Tops> searchTopsByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return topsMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Tops> searchTopsByVariation(String variation) {
        return topsMapper.findByVariation(variation);
    }

    public List<Tops> searchTopsByDiy(String diy) {
        return topsMapper.findByDiy(diy);
    }

    public List<Tops> searchTopsByColor1(String color1) {
        return topsMapper.findByColor1(color1);
    }

    public List<Tops> searchTopsByColor2(String color2) {
        return topsMapper.findByColor2(color2);
    }

    public List<Tops> searchTopsBySource(String source) {
        return topsMapper.findBySource(source);
    }

    public List<Tops> searchTopsBySourceNotes(String sourceNotes) {
        return topsMapper.findBySourceNotes(sourceNotes);
    }

    public List<Tops> searchTopsBySeasonalAvailability(String seasonalAvailability) {
        return topsMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<Tops> searchTopsByMannequinPiece(String mannequinPiece) {
        return topsMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<Tops> searchTopsByStyle(String style) {
        return topsMapper.findByStyle(style);
    }

    public List<Tops> searchTopsByLabelThemes(String labelThemes) {
        return topsMapper.findByLabelThemes(labelThemes);
    }

    public List<Tops> searchTopsByCatalog(String catalog) {
        return topsMapper.findByCatalog(catalog);
    }

    public List<TopsMaterials> getTopsMaterialsByName(String name) {
        List<TopsMaterials> materials = topsMapper.selectTopsMaterialsByName(name);
        Set<TopsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
