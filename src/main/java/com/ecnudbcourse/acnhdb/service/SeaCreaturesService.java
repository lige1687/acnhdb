package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.SeaCreatures;
import com.ecnudbcourse.acnhdb.mapper.SeaCreaturesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SeaCreaturesService {

    @Autowired
    private SeaCreaturesMapper sea_creaturesMapper;

    public List<SeaCreatures> findByName(String name) { return sea_creaturesMapper.findByName(name); }

    public int insertSeaCreatures(SeaCreatures sea_creatures) { return sea_creaturesMapper.insertSeaCreatures(sea_creatures); }

    public int updateSeaCreatures(SeaCreatures sea_creatures) { return sea_creaturesMapper.updateSeaCreatures(sea_creatures); }

    public int deleteById(Long id) { return sea_creaturesMapper.deleteById(id); }

    public List<SeaCreatures> getAll() { return sea_creaturesMapper.selectList(null); }

    public SeaCreatures getById(Long id) { return sea_creaturesMapper.selectById(id); }


    public List<SeaCreatures> searchSeaCreaturesBySellRangeAndSort(Integer min, Integer max, String sort) {
        return sea_creaturesMapper.searchBySellRangeAndSort(min, max, sort);
    }
}
