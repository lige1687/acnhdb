package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Fish;
import com.ecnudbcourse.acnhdb.mapper.FishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FishService {

    @Autowired
    private FishMapper fishMapper;

    public List<Fish> findByName(String name) { return fishMapper.findByName(name); }

    public int insertFish(Fish fish) { return fishMapper.insertFish(fish); }

    public int updateFish(Fish fish) { return fishMapper.updateFish(fish); }

    public int deleteById(Long id) { return fishMapper.deleteById(id); }

    public List<Fish> getAll() { return fishMapper.selectList(null); }

    public Fish getById(Long id) { return fishMapper.selectById(id); }

}
