package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Villagers;
import com.ecnudbcourse.acnhdb.mapper.VillagersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VillagersService {

    @Autowired
    private VillagersMapper villagersMapper;

    public List<Villagers> findByName(String name) { return villagersMapper.findByName(name); }

    public int insertVillagers(Villagers villagers) { return villagersMapper.insertVillagers(villagers); }

    public int updateVillagers(Villagers villagers) { return villagersMapper.updateVillagers(villagers); }

    public int deleteById(Long id) { return villagersMapper.deleteById(id); }

    public List<Villagers> getAll() { return villagersMapper.selectList(null); }

    public Villagers getById(Long id) { return villagersMapper.selectById(id); }


    public List<Villagers> findVillagers(String species, String gender, String personality, String hobby, String birthday) {
        return villagersMapper.findVillagers(species, gender, personality, hobby, birthday );
    }

    public List<Villagers> searchVillagersByCatchphrase(String catchphrase) {
        return villagersMapper.findByCatchphrase(catchphrase);
    }

    public List<Villagers> searchVillagersByFavoriteSong(String favoriteSong) {
        return villagersMapper.findByFavoriteSong(favoriteSong);
    }

    public List<Villagers> searchVillagersByStyle1(String style1) {
        return villagersMapper.findByStyle1(style1);
    }

    public List<Villagers> searchVillagersByStyle2(String style2) {
        return villagersMapper.findByStyle2(style2);
    }

    public List<Villagers> searchVillagersByColor1(String color1) {
        return villagersMapper.findByColor1(color1);
    }

    public List<Villagers> searchVillagersByColor2(String color2) {
        return villagersMapper.findByColor2(color2);
    }

    public List<Villagers> searchVillagersByWallpaper(String wallpaper) {
        return villagersMapper.findByWallpaper(wallpaper);
    }

    public List<Villagers> searchVillagersByFlooring(String flooring) {
        return villagersMapper.findByFlooring(flooring);
    }
}
