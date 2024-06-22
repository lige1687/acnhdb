package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Floors;
import com.ecnudbcourse.acnhdb.mapper.FloorsMapper;
import com.ecnudbcourse.acnhdb.dto.FloorsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FloorsService {

    @Autowired
    private FloorsMapper floorsMapper;

    public List<Floors> findByName(String name) { return floorsMapper.findByName(name); }

    public int insertFloors(Floors floors) { return floorsMapper.insertFloors(floors); }

    public int updateFloors(Floors floors) { return floorsMapper.updateFloors(floors); }

    public int deleteById(Long id) { return floorsMapper.deleteById(id); }

    public List<Floors> getAll() { return floorsMapper.selectList(null); }

    public Floors getById(Long id) { return floorsMapper.selectById(id); }


    public List<Floors> searchFloorsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return floorsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Floors> searchFloorsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return floorsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Floors> searchFloorsByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return floorsMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Floors> searchFloorsByVfx(String vfx) {
        return floorsMapper.findByVfx(vfx);
    }

    public List<Floors> searchFloorsByDiy(String diy) {
        return floorsMapper.findByDiy(diy);
    }

    public List<Floors> searchFloorsByColor1(String color1) {
        return floorsMapper.findByColor1(color1);
    }

    public List<Floors> searchFloorsByColor2(String color2) {
        return floorsMapper.findByColor2(color2);
    }

    public List<Floors> searchFloorsBySource(String source) {
        return floorsMapper.findBySource(source);
    }

    public List<Floors> searchFloorsByHhaConcept1(String hhaConcept1) {
        return floorsMapper.findByHhaConcept1(hhaConcept1);
    }

    public List<Floors> searchFloorsByHhaConcept2(String hhaConcept2) {
        return floorsMapper.findByHhaConcept2(hhaConcept2);
    }

    public List<Floors> searchFloorsByHhaSeries(String hhaSeries) {
        return floorsMapper.findByHhaSeries(hhaSeries);
    }

    public List<Floors> searchFloorsByTag(String tag) {
        return floorsMapper.findByTag(tag);
    }

    public List<Floors> searchFloorsByCatalog(String catalog) {
        return floorsMapper.findByCatalog(catalog);
    }

    public List<FloorsMaterials> getFloorsMaterialsByName(String name) {
        List<FloorsMaterials> materials = floorsMapper.selectFloorsMaterialsByName(name);
        Set<FloorsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
