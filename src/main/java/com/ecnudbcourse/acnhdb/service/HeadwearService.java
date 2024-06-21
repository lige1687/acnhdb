package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Headwear;
import com.ecnudbcourse.acnhdb.mapper.HeadwearMapper;
import com.ecnudbcourse.acnhdb.dto.HeadwearMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HeadwearService {

    @Autowired
    private HeadwearMapper headwearMapper;

    public List<Headwear> findByName(String name) { return headwearMapper.findByName(name); }

    public int insertHeadwear(Headwear headwear) { return headwearMapper.insertHeadwear(headwear); }

    public int updateHeadwear(Headwear headwear) { return headwearMapper.updateHeadwear(headwear); }

    public int deleteById(Long id) { return headwearMapper.deleteById(id); }

    public List<Headwear> getAll() { return headwearMapper.selectList(null); }

    public Headwear getById(Long id) { return headwearMapper.selectById(id); }


    public List<Headwear> searchHeadwearByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return headwearMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Headwear> searchHeadwearBySellRangeAndSort(Integer min, Integer max, String sort) {
        return headwearMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Headwear> searchHeadwearByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return headwearMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Headwear> searchHeadwearByDiy(String diy) {
        return headwearMapper.findByDiy(diy);
    }

    public List<HeadwearMaterials> getHeadwearMaterialsByName(String name) {
        List<HeadwearMaterials> materials = headwearMapper.selectHeadwearMaterialsByName(name);
        Set<HeadwearMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
