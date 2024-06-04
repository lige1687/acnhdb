package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Floors;
import com.ecnudbcourse.acnhdb.mapper.FloorsMapper;
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

}
