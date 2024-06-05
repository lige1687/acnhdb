package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.WallMounted;
import com.ecnudbcourse.acnhdb.mapper.WallMountedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WallMountedService {

    @Autowired
    private WallMountedMapper wall_mountedMapper;

    public List<WallMounted> findByName(String name) { return wall_mountedMapper.findByName(name); }

    public int insertWallMounted(WallMounted wall_mounted) { return wall_mountedMapper.insertWallMounted(wall_mounted); }

    public int updateWallMounted(WallMounted wall_mounted) { return wall_mountedMapper.updateWallMounted(wall_mounted); }

    public int deleteById(Long id) { return wall_mountedMapper.deleteById(id); }

    public List<WallMounted> getAll() { return wall_mountedMapper.selectList(null); }

    public WallMounted getById(Long id) { return wall_mountedMapper.selectById(id); }

}
