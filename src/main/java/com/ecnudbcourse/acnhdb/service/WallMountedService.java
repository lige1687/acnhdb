package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.WallMounted;
import com.ecnudbcourse.acnhdb.mapper.WallMountedMapper;
import com.ecnudbcourse.acnhdb.dto.WallMountedMaterials;
import java.util.Set;
import java.util.stream.Collectors;
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


    public List<WallMounted> searchWallMountedByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return wall_mountedMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<WallMounted> searchWallMountedBySellRangeAndSort(Integer min, Integer max, String sort) {
        return wall_mountedMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<WallMounted> searchWallMountedByKitCostRangeAndSort(Integer min, Integer max, String sort) {
        return wall_mountedMapper.searchByKitCostRangeAndSort(min, max, sort);
    }

    public List<WallMounted> searchWallMountedByVariation(String variation) {
        return wall_mountedMapper.findByVariation(variation);
    }

    public List<WallMounted> searchWallMountedByBodyTitle(String bodyTitle) {
        return wall_mountedMapper.findByBodyTitle(bodyTitle);
    }

    public List<WallMounted> searchWallMountedByPattern(String pattern) {
        return wall_mountedMapper.findByPattern(pattern);
    }

    public List<WallMounted> searchWallMountedByPatternTitle(String patternTitle) {
        return wall_mountedMapper.findByPatternTitle(patternTitle);
    }

    public List<WallMounted> searchWallMountedByDiy(String diy) {
        return wall_mountedMapper.findByDiy(diy);
    }

    public List<WallMounted> searchWallMountedByBodyCustomize(String bodyCustomize) {
        return wall_mountedMapper.findByBodyCustomize(bodyCustomize);
    }

    public List<WallMounted> searchWallMountedByPatternCustomize(String patternCustomize) {
        return wall_mountedMapper.findByPatternCustomize(patternCustomize);
    }

    public List<WallMounted> searchWallMountedByColor1(String color1) {
        return wall_mountedMapper.findByColor1(color1);
    }

    public List<WallMounted> searchWallMountedByColor2(String color2) {
        return wall_mountedMapper.findByColor2(color2);
    }

    public List<WallMounted> searchWallMountedBySize(String size) {
        return wall_mountedMapper.findBySize(size);
    }

    public List<WallMounted> searchWallMountedBySource(String source) {
        return wall_mountedMapper.findBySource(source);
    }

    public List<WallMounted> searchWallMountedBySourceNotes(String sourceNotes) {
        return wall_mountedMapper.findBySourceNotes(sourceNotes);
    }

    public List<WallMounted> searchWallMountedByHhaConcept1(String hhaConcept1) {
        return wall_mountedMapper.findByHhaConcept1(hhaConcept1);
    }

    public List<WallMounted> searchWallMountedByHhaConcept2(String hhaConcept2) {
        return wall_mountedMapper.findByHhaConcept2(hhaConcept2);
    }

    public List<WallMounted> searchWallMountedByHhaSeries(String hhaSeries) {
        return wall_mountedMapper.findByHhaSeries(hhaSeries);
    }

    public List<WallMounted> searchWallMountedByHhaSet(String hhaSet) {
        return wall_mountedMapper.findByHhaSet(hhaSet);
    }

    public List<WallMounted> searchWallMountedByInteract(String interact) {
        return wall_mountedMapper.findByInteract(interact);
    }

    public List<WallMounted> searchWallMountedByTag(String tag) {
        return wall_mountedMapper.findByTag(tag);
    }

    public List<WallMounted> searchWallMountedByLightingType(String lightingType) {
        return wall_mountedMapper.findByLightingType(lightingType);
    }

    public List<WallMounted> searchWallMountedByDoorDeco(String doorDeco) {
        return wall_mountedMapper.findByDoorDeco(doorDeco);
    }

    public List<WallMounted> searchWallMountedByCatalog(String catalog) {
        return wall_mountedMapper.findByCatalog(catalog);
    }

    public List<WallMountedMaterials> getWallMountedMaterialsByName(String name) {
        List<WallMountedMaterials> materials = wall_mountedMapper.selectWallMountedMaterialsByName(name);
        Set<WallMountedMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
