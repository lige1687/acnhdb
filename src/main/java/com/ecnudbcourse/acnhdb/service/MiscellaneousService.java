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

    public List<Miscellaneous> searchMiscellaneousByDiy(String diy) {
        return miscellaneousMapper.findByDiy(diy);
    }

    public List<Miscellaneous> searchMiscellaneousByBodyCustomize(String bodyCustomize) {
        return miscellaneousMapper.findByBodyCustomize(bodyCustomize);
    }

    public List<Miscellaneous> searchMiscellaneousByPatternCustomize(String patternCustomize) {
        return miscellaneousMapper.findByPatternCustomize(patternCustomize);
    }

    public List<Miscellaneous> searchMiscellaneousByInteract(String interact) {
        return miscellaneousMapper.findByInteract(interact);
    }

    public List<Miscellaneous> searchMiscellaneousByOutdoor(String outdoor) {
        return miscellaneousMapper.findByOutdoor(outdoor);
    }

    public List<MiscellaneousMaterials> getMiscellaneousMaterialsByName(String name) {
        List<MiscellaneousMaterials> materials = miscellaneousMapper.selectMiscellaneousMaterialsByName(name);
        Set<MiscellaneousMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
