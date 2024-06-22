package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.mapper.ShoesMapper;
import com.ecnudbcourse.acnhdb.dto.ShoesMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShoesService {

    @Autowired
    private ShoesMapper shoesMapper;

    public List<Shoes> findByName(String name) { return shoesMapper.findByName(name); }

    public int insertShoes(Shoes shoes) { return shoesMapper.insertShoes(shoes); }

    public int updateShoes(Shoes shoes) { return shoesMapper.updateShoes(shoes); }

    public int deleteById(Long id) { return shoesMapper.deleteById(id); }

    public List<Shoes> getAll() { return shoesMapper.selectList(null); }

    public Shoes getById(Long id) { return shoesMapper.selectById(id); }


    public List<Shoes> searchShoesByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return shoesMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Shoes> searchShoesBySellRangeAndSort(Integer min, Integer max, String sort) {
        return shoesMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Shoes> searchShoesByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return shoesMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Shoes> searchShoesByVariation(String variation) {
        return shoesMapper.findByVariation(variation);
    }

    public List<Shoes> searchShoesByDiy(String diy) {
        return shoesMapper.findByDiy(diy);
    }

    public List<Shoes> searchShoesByColor1(String color1) {
        return shoesMapper.findByColor1(color1);
    }

    public List<Shoes> searchShoesByColor2(String color2) {
        return shoesMapper.findByColor2(color2);
    }

    public List<Shoes> searchShoesBySource(String source) {
        return shoesMapper.findBySource(source);
    }

    public List<Shoes> searchShoesBySourceNotes(String sourceNotes) {
        return shoesMapper.findBySourceNotes(sourceNotes);
    }

    public List<Shoes> searchShoesBySeasonalAvailability(String seasonalAvailability) {
        return shoesMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<Shoes> searchShoesByMannequinPiece(String mannequinPiece) {
        return shoesMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<Shoes> searchShoesByStyle(String style) {
        return shoesMapper.findByStyle(style);
    }

    public List<Shoes> searchShoesByLabelThemes(String labelThemes) {
        return shoesMapper.findByLabelThemes(labelThemes);
    }

    public List<Shoes> searchShoesByCatalog(String catalog) {
        return shoesMapper.findByCatalog(catalog);
    }

    public List<ShoesMaterials> getShoesMaterialsByName(String name) {
        List<ShoesMaterials> materials = shoesMapper.selectShoesMaterialsByName(name);
        Set<ShoesMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
