package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Rugs;
import com.ecnudbcourse.acnhdb.mapper.RugsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RugsService {

    @Autowired
    private RugsMapper rugsMapper;

    public List<Rugs> findByName(String name) { return rugsMapper.findByName(name); }

    public int insertRugs(Rugs rugs) { return rugsMapper.insertRugs(rugs); }

    public int updateRugs(Rugs rugs) { return rugsMapper.updateRugs(rugs); }

    public int deleteById(Long id) { return rugsMapper.deleteById(id); }

    public List<Rugs> getAll() { return rugsMapper.selectList(null); }

    public Rugs getById(Long id) { return rugsMapper.selectById(id); }

}
