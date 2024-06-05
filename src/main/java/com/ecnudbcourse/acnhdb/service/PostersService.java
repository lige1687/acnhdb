package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Posters;
import com.ecnudbcourse.acnhdb.mapper.PostersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostersService {

    @Autowired
    private PostersMapper postersMapper;

    public List<Posters> findByName(String name) { return postersMapper.findByName(name); }

    public int insertPosters(Posters posters) { return postersMapper.insertPosters(posters); }

    public int updatePosters(Posters posters) { return postersMapper.updatePosters(posters); }

    public int deleteById(Long id) { return postersMapper.deleteById(id); }

    public List<Posters> getAll() { return postersMapper.selectList(null); }

    public Posters getById(Long id) { return postersMapper.selectById(id); }

}
