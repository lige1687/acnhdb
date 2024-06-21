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

    public List<WallMounted> searchWallMountedByDiy(String diy) {
        return wall_mountedMapper.findByDiy(diy);
    }

    public List<WallMounted> searchWallMountedByBodyCustomize(String bodyCustomize) {
        return wall_mountedMapper.findByBodyCustomize(bodyCustomize);
    }

    public List<WallMounted> searchWallMountedByPatternCustomize(String patternCustomize) {
        return wall_mountedMapper.findByPatternCustomize(patternCustomize);
    }

    public List<WallMounted> searchWallMountedByInteract(String interact) {
        return wall_mountedMapper.findByInteract(interact);
    }

    public List<WallMountedMaterials> getWallMountedMaterialsByName(String name) {
        List<WallMountedMaterials> materials = wall_mountedMapper.selectWallMountedMaterialsByName(name);
        Set<WallMountedMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
