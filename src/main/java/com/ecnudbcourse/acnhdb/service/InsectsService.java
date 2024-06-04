package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Insects;
import com.ecnudbcourse.acnhdb.mapper.InsectsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InsectsService {

    @Autowired
    private InsectsMapper insectsMapper;

    public List<Insects> findByName(String name) { return insectsMapper.findByName(name); }

    public int insertInsects(Insects insects) { return insectsMapper.insertInsects(insects); }

    public int updateInsects(Insects insects) { return insectsMapper.updateInsects(insects); }

    public int deleteById(Long id) { return insectsMapper.deleteById(id); }

    public List<Insects> getAll() { return insectsMapper.selectList(null); }

    public Insects getById(Long id) { return insectsMapper.selectById(id); }

}
