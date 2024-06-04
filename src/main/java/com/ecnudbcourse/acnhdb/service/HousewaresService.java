package com.ecnudbcourse.acnhdb.service;




import com.ecnudbcourse.acnhdb.entity.Housewares;
import com.ecnudbcourse.acnhdb.mapper.HousewaresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
