package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Other;
import com.ecnudbcourse.acnhdb.mapper.OtherMapper;
import com.ecnudbcourse.acnhdb.dto.OtherMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OtherService {

    @Autowired
    private OtherMapper otherMapper;

    public List<Other> findByName(String name) { return otherMapper.findByName(name); }

    public int insertOther(Other other) { return otherMapper.insertOther(other); }

    public int updateOther(Other other) { return otherMapper.updateOther(other); }

    public int deleteById(Long id) { return otherMapper.deleteById(id); }

    public List<Other> getAll() { return otherMapper.selectList(null); }

    public Other getById(Long id) { return otherMapper.selectById(id); }


    public List<Other> searchOtherByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return otherMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Other> searchOtherBySellRangeAndSort(Integer min, Integer max, String sort) {
        return otherMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Other> searchOtherByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return otherMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Other> searchOtherByDiy(String diy) {
        return otherMapper.findByDiy(diy);
    }

    public List<Other> searchOtherByStackSize(String stackSize) {
        return otherMapper.findByStackSize(stackSize);
    }

    public List<Other> searchOtherBySource(String source) {
        return otherMapper.findBySource(source);
    }

    public List<Other> searchOtherBySourceNotes(String sourceNotes) {
        return otherMapper.findBySourceNotes(sourceNotes);
    }

    public List<Other> searchOtherByTag(String tag) {
        return otherMapper.findByTag(tag);
    }

    public List<Other> searchOtherByColor1(String color1) {
        return otherMapper.findByColor1(color1);
    }

    public List<Other> searchOtherByColor2(String color2) {
        return otherMapper.findByColor2(color2);
    }

    public List<OtherMaterials> getOtherMaterialsByName(String name) {
        List<OtherMaterials> materials = otherMapper.selectOtherMaterialsByName(name);
        Set<OtherMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
