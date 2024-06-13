package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.dto.HouseWareMaterials;
import com.ecnudbcourse.acnhdb.entity.Housewares;
import com.ecnudbcourse.acnhdb.mapper.HousewaresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HousewaresService {

    @Autowired
    private HousewaresMapper housewaresMapper;

    public List<Housewares> findByName(String name) {
        return housewaresMapper.findByName(name);
    }

    public int insertHouseWare(Housewares housewares) {
        return housewaresMapper.insertHouseWare(housewares);
    }

    public int updateHouseWare(Housewares housewares) {
        return housewaresMapper.updateHouseWare(housewares);
    }

    public int deleteById(Long id) {
        return housewaresMapper.deleteById(id);
    }

    public List<Housewares> getAll() {
        return housewaresMapper.selectList(null);
    }

    public Housewares getById(Long id) {
        return housewaresMapper.selectById(id);
    }
    public List<HouseWareMaterials> getHouseWareMaterialsByName(String name) {
        List<HouseWareMaterials> materials = housewaresMapper.selectHouseWareMaterialsByName(name);
        // 使用Set集合来去重
        Set<HouseWareMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
