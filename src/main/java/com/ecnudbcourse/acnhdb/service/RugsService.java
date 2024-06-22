package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Rugs;
import com.ecnudbcourse.acnhdb.mapper.RugsMapper;
import com.ecnudbcourse.acnhdb.dto.RugsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RugsService {

    @Autowired
    private RugsMapper rugsMapper;

    public List<Rugs> findByName(String name) { return rugsMapper.findByName(name); }

    public int insertRugs(Rugs rugs) { return rugsMapper.insertRugs(rugs); }

    public int updateRugs(Rugs rugs) { return rugsMapper.updateRugs(rugs); }

    public int deleteById(Long id) { return rugsMapper.deleteById(id); }

    public List<Rugs> getAll() { return rugsMapper.selectList(null); }

    public Rugs getById(Long id) { return rugsMapper.selectById(id); }


    public List<Rugs> searchRugsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return rugsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Rugs> searchRugsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return rugsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Rugs> searchRugsByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return rugsMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Rugs> searchRugsByDiy(String diy) {
        return rugsMapper.findByDiy(diy);
    }

    public List<Rugs> searchRugsByColor1(String color1) {
        return rugsMapper.findByColor1(color1);
    }

    public List<Rugs> searchRugsByColor2(String color2) {
        return rugsMapper.findByColor2(color2);
    }

    public List<Rugs> searchRugsBySize(String size) {
        return rugsMapper.findBySize(size);
    }

    public List<Rugs> searchRugsBySource(String source) {
        return rugsMapper.findBySource(source);
    }

    public List<Rugs> searchRugsBySourceNotes(String sourceNotes) {
        return rugsMapper.findBySourceNotes(sourceNotes);
    }

    public List<Rugs> searchRugsByHhaConcept1(String hhaConcept1) {
        return rugsMapper.findByHhaConcept1(hhaConcept1);
    }

    public List<Rugs> searchRugsByHhaConcept2(String hhaConcept2) {
        return rugsMapper.findByHhaConcept2(hhaConcept2);
    }

    public List<Rugs> searchRugsByHhaSeries(String hhaSeries) {
        return rugsMapper.findByHhaSeries(hhaSeries);
    }

    public List<Rugs> searchRugsByTag(String tag) {
        return rugsMapper.findByTag(tag);
    }

    public List<Rugs> searchRugsByCatalog(String catalog) {
        return rugsMapper.findByCatalog(catalog);
    }

    public List<RugsMaterials> getRugsMaterialsByName(String name) {
        List<RugsMaterials> materials = rugsMapper.selectRugsMaterialsByName(name);
        Set<RugsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
