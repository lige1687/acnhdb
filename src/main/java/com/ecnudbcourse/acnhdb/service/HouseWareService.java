package com.ecnudbcourse.acnhdb.service;




import com.ecnudbcourse.acnhdb.dto.HouseWareMaterials;
import com.ecnudbcourse.acnhdb.entity.HouseWare;
import com.ecnudbcourse.acnhdb.mapper.HouseWareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseWareService {

    @Autowired
    private HouseWareMapper houseWareMapper;

    public List<HouseWare> findByName(String name) {
        return houseWareMapper.findByName(name);
    }

    public int insertHouseWare(HouseWare houseWare) {
        return houseWareMapper.insertHouseWare(houseWare);
    }

    public int updateHouseWare(HouseWare houseWare) {
        return houseWareMapper.updateHouseWare(houseWare);
    }

    public int deleteById(Long id) {
        return houseWareMapper.deleteById(id);
    }

    public List<HouseWare> getAll() {
        return houseWareMapper.selectList(null);
    }

    public HouseWare getById(Long id) {
        return houseWareMapper.selectById(id);
    }

    // join获取用法
    public HouseWareMaterials getHousewareMaterialByName(String name) {
        return houseWareMapper.selectMaterialsByName(name);
    }
}
