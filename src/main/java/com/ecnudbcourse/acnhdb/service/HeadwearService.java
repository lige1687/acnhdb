package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Headwear;
import com.ecnudbcourse.acnhdb.mapper.HeadwearMapper;
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

}
