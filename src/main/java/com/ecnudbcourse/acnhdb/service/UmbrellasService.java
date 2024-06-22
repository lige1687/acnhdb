package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Umbrellas;
import com.ecnudbcourse.acnhdb.mapper.UmbrellasMapper;
import com.ecnudbcourse.acnhdb.dto.UmbrellasMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UmbrellasService {

    @Autowired
    private UmbrellasMapper umbrellasMapper;

    public List<Umbrellas> findByName(String name) { return umbrellasMapper.findByName(name); }

    public int insertUmbrellas(Umbrellas umbrellas) { return umbrellasMapper.insertUmbrellas(umbrellas); }

    public int updateUmbrellas(Umbrellas umbrellas) { return umbrellasMapper.updateUmbrellas(umbrellas); }

    public int deleteById(Long id) { return umbrellasMapper.deleteById(id); }

    public List<Umbrellas> getAll() { return umbrellasMapper.selectList(null); }

    public Umbrellas getById(Long id) { return umbrellasMapper.selectById(id); }


    public List<Umbrellas> searchUmbrellasByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return umbrellasMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Umbrellas> searchUmbrellasBySellRangeAndSort(Integer min, Integer max, String sort) {
        return umbrellasMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Umbrellas> searchUmbrellasByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return umbrellasMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Umbrellas> searchUmbrellasByDiy(String diy) {
        return umbrellasMapper.findByDiy(diy);
    }

    public List<Umbrellas> searchUmbrellasByColor1(String color1) {
        return umbrellasMapper.findByColor1(color1);
    }

    public List<Umbrellas> searchUmbrellasByColor2(String color2) {
        return umbrellasMapper.findByColor2(color2);
    }

    public List<Umbrellas> searchUmbrellasBySource(String source) {
        return umbrellasMapper.findBySource(source);
    }

    public List<Umbrellas> searchUmbrellasBySourceNotes(String sourceNotes) {
        return umbrellasMapper.findBySourceNotes(sourceNotes);
    }

    public List<Umbrellas> searchUmbrellasByCatalog(String catalog) {
        return umbrellasMapper.findByCatalog(catalog);
    }

    public List<UmbrellasMaterials> getUmbrellasMaterialsByName(String name) {
        List<UmbrellasMaterials> materials = umbrellasMapper.selectUmbrellasMaterialsByName(name);
        Set<UmbrellasMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
