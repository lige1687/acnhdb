package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Tops;
import com.ecnudbcourse.acnhdb.mapper.TopsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TopsService {

    @Autowired
    private TopsMapper topsMapper;

    public List<Tops> findByName(String name) { return topsMapper.findByName(name); }

    public int insertTops(Tops tops) { return topsMapper.insertTops(tops); }

    public int updateTops(Tops tops) { return topsMapper.updateTops(tops); }

    public int deleteById(Long id) { return topsMapper.deleteById(id); }

    public List<Tops> getAll() { return topsMapper.selectList(null); }

    public Tops getById(Long id) { return topsMapper.selectById(id); }

}
