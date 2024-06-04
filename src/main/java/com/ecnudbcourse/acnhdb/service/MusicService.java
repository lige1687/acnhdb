package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Music;
import com.ecnudbcourse.acnhdb.mapper.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    public List<Music> findByName(String name) { return musicMapper.findByName(name); }

    public int insertMusic(Music music) { return musicMapper.insertMusic(music); }

    public int updateMusic(Music music) { return musicMapper.updateMusic(music); }

    public int deleteById(Long id) { return musicMapper.deleteById(id); }

    public List<Music> getAll() { return musicMapper.selectList(null); }

    public Music getById(Long id) { return musicMapper.selectById(id); }

}
