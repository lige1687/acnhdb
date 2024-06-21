package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Wallpaper;
import com.ecnudbcourse.acnhdb.mapper.WallpaperMapper;
import com.ecnudbcourse.acnhdb.dto.WallpaperMaterials;
import java.util.Set;
import java.util.stream.Collectors;
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


    public List<Wallpaper> searchWallpaperByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return wallpaperMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Wallpaper> searchWallpaperBySellRangeAndSort(Integer min, Integer max, String sort) {
        return wallpaperMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Wallpaper> searchWallpaperByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return wallpaperMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Wallpaper> searchWallpaperByDiy(String diy) {
        return wallpaperMapper.findByDiy(diy);
    }

    public List<Wallpaper> searchWallpaperByVfx(String vfx) {
        return wallpaperMapper.findByVfx(vfx);
    }

    public List<WallpaperMaterials> getWallpaperMaterialsByName(String name) {
        List<WallpaperMaterials> materials = wallpaperMapper.selectWallpaperMaterialsByName(name);
        Set<WallpaperMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
