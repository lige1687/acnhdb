package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Fossils;
import com.ecnudbcourse.acnhdb.mapper.FossilsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FossilsService {

    @Autowired
    private FossilsMapper fossilsMapper;

    public List<Fossils> findByName(String name) { return fossilsMapper.findByName(name); }

    public int insertFossils(Fossils fossils) { return fossilsMapper.insertFossils(fossils); }

    public int updateFossils(Fossils fossils) { return fossilsMapper.updateFossils(fossils); }

    public int deleteById(Long id) { return fossilsMapper.deleteById(id); }

    public List<Fossils> getAll() { return fossilsMapper.selectList(null); }

    public Fossils getById(Long id) { return fossilsMapper.selectById(id); }


    public List<Fossils> searchFossilsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return fossilsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Fossils> searchFossilsByInteract(String interact) {
        return fossilsMapper.findByInteract(interact);
    }
}
