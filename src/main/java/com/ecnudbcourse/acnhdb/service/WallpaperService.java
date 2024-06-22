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

    public List<Wallpaper> searchWallpaperByVfx(String vfx) {
        return wallpaperMapper.findByVfx(vfx);
    }

    public List<Wallpaper> searchWallpaperByVfxType(String vfxType) {
        return wallpaperMapper.findByVfxType(vfxType);
    }

    public List<Wallpaper> searchWallpaperByDiy(String diy) {
        return wallpaperMapper.findByDiy(diy);
    }

    public List<Wallpaper> searchWallpaperByColor1(String color1) {
        return wallpaperMapper.findByColor1(color1);
    }

    public List<Wallpaper> searchWallpaperByColor2(String color2) {
        return wallpaperMapper.findByColor2(color2);
    }

    public List<Wallpaper> searchWallpaperBySource(String source) {
        return wallpaperMapper.findBySource(source);
    }

    public List<Wallpaper> searchWallpaperBySourceNotes(String sourceNotes) {
        return wallpaperMapper.findBySourceNotes(sourceNotes);
    }

    public List<Wallpaper> searchWallpaperByCatalog(String catalog) {
        return wallpaperMapper.findByCatalog(catalog);
    }

    public List<Wallpaper> searchWallpaperByWindowType(String windowType) {
        return wallpaperMapper.findByWindowType(windowType);
    }

    public List<Wallpaper> searchWallpaperByWindowColor(String windowColor) {
        return wallpaperMapper.findByWindowColor(windowColor);
    }

    public List<Wallpaper> searchWallpaperByPaneType(String paneType) {
        return wallpaperMapper.findByPaneType(paneType);
    }

    public List<Wallpaper> searchWallpaperByCurtainType(String curtainType) {
        return wallpaperMapper.findByCurtainType(curtainType);
    }

    public List<Wallpaper> searchWallpaperByCurtainColor(String curtainColor) {
        return wallpaperMapper.findByCurtainColor(curtainColor);
    }

    public List<Wallpaper> searchWallpaperByCeilingType(String ceilingType) {
        return wallpaperMapper.findByCeilingType(ceilingType);
    }

    public List<Wallpaper> searchWallpaperByHhaConcept1(String hhaConcept1) {
        return wallpaperMapper.findByHhaConcept1(hhaConcept1);
    }

    public List<Wallpaper> searchWallpaperByHhaConcept2(String hhaConcept2) {
        return wallpaperMapper.findByHhaConcept2(hhaConcept2);
    }

    public List<Wallpaper> searchWallpaperByHhaSeries(String hhaSeries) {
        return wallpaperMapper.findByHhaSeries(hhaSeries);
    }

    public List<Wallpaper> searchWallpaperByTag(String tag) {
        return wallpaperMapper.findByTag(tag);
    }

    public List<WallpaperMaterials> getWallpaperMaterialsByName(String name) {
        List<WallpaperMaterials> materials = wallpaperMapper.selectWallpaperMaterialsByName(name);
        Set<WallpaperMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
