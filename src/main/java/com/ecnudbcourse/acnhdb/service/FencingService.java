package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Fencing;
import com.ecnudbcourse.acnhdb.mapper.FencingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FencingService {

    @Autowired
    private FencingMapper fencingMapper;

    public List<Fencing> findByName(String name) { return fencingMapper.findByName(name); }

    public int insertFencing(Fencing fencing) { return fencingMapper.insertFencing(fencing); }

    public int updateFencing(Fencing fencing) { return fencingMapper.updateFencing(fencing); }

    public int deleteById(Long id) { return fencingMapper.deleteById(id); }

    public List<Fencing> getAll() { return fencingMapper.selectList(null); }

    public Fencing getById(Long id) { return fencingMapper.selectById(id); }


    public List<Fencing> searchFencingBySellRangeAndSort(Integer min, Integer max, String sort) {
        return fencingMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Fencing> searchFencingBySource(String source) {
        return fencingMapper.findBySource(source);
    }
}
