package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.DressUp;
import com.ecnudbcourse.acnhdb.mapper.DressUpMapper;
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

}
