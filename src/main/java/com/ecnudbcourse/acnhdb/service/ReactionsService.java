package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Reactions;
import com.ecnudbcourse.acnhdb.mapper.ReactionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReactionsService {

    @Autowired
    private ReactionsMapper reactionsMapper;

    public List<Reactions> findByName(String name) { return reactionsMapper.findByName(name); }

    public int insertReactions(Reactions reactions) { return reactionsMapper.insertReactions(reactions); }

    public int updateReactions(Reactions reactions) { return reactionsMapper.updateReactions(reactions); }

    public int deleteById(Long id) { return reactionsMapper.deleteById(id); }

    public List<Reactions> getAll() { return reactionsMapper.selectList(null); }

    public Reactions getById(Long id) { return reactionsMapper.selectById(id); }

}
