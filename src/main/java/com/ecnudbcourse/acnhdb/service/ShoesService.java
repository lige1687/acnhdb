package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.mapper.ShoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShoesService {

    @Autowired
    private ShoesMapper shoesMapper;

    public List<Shoes> findByName(String name) { return shoesMapper.findByName(name); }

    public int insertShoes(Shoes shoes) { return shoesMapper.insertShoes(shoes); }

    public int updateShoes(Shoes shoes) { return shoesMapper.updateShoes(shoes); }

    public int deleteById(Long id) { return shoesMapper.deleteById(id); }

    public List<Shoes> getAll() { return shoesMapper.selectList(null); }

    public Shoes getById(Long id) { return shoesMapper.selectById(id); }

}
