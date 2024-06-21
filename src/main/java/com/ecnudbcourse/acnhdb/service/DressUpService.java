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

    public List<DressUp> searchDressUpByDiy(String diy) {
        return dress_upMapper.findByDiy(diy);
    }

    public List<DressUpMaterials> getDressUpMaterialsByName(String name) {
        List<DressUpMaterials> materials = dress_upMapper.selectDressUpMaterialsByName(name);
        Set<DressUpMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
