package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Other;
import com.ecnudbcourse.acnhdb.mapper.OtherMapper;
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

}
