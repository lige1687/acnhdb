package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Bags;
import com.ecnudbcourse.acnhdb.mapper.BagsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BagsService {

    @Autowired
    private BagsMapper bagsMapper;

    public List<Bags> findByName(String name) { return bagsMapper.findByName(name); }

    public int insertBags(Bags bags) { return bagsMapper.insertBags(bags); }

    public int updateBags(Bags bags) { return bagsMapper.updateBags(bags); }

    public int deleteById(Long id) { return bagsMapper.deleteById(id); }

    public List<Bags> getAll() { return bagsMapper.selectList(null); }

    public Bags getById(Long id) { return bagsMapper.selectById(id); }

}
