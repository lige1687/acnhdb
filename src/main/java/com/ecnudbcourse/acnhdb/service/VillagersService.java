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

    public List<Villagers> findVillagers(String species, String gender, String personality, String hobby, String birthdayMonth) {
        return villagersMapper.findVillagers(species, gender, personality, hobby,birthdayMonth );
    }
}
