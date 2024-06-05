package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Wallpaper;
import com.ecnudbcourse.acnhdb.mapper.WallpaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WallpaperService {

    @Autowired
    private WallpaperMapper wallpaperMapper;

    public List<Wallpaper> findByName(String name) { return wallpaperMapper.findByName(name); }

    public int insertWallpaper(Wallpaper wallpaper) { return wallpaperMapper.insertWallpaper(wallpaper); }

    public int updateWallpaper(Wallpaper wallpaper) { return wallpaperMapper.updateWallpaper(wallpaper); }

    public int deleteById(Long id) { return wallpaperMapper.deleteById(id); }

    public List<Wallpaper> getAll() { return wallpaperMapper.selectList(null); }

    public Wallpaper getById(Long id) { return wallpaperMapper.selectById(id); }

}
