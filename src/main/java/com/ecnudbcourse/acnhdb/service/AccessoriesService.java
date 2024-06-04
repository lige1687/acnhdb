package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Accessories;
import com.ecnudbcourse.acnhdb.mapper.AccessoriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccessoriesService {

    @Autowired
    private AccessoriesMapper accessoriesMapper;

    public List<Accessories> findByName(String name) { return accessoriesMapper.findByName(name); }

    public int insertAccessories(Accessories accessories) { return accessoriesMapper.insertAccessories(accessories); }

    public int updateAccessories(Accessories accessories) { return accessoriesMapper.updateAccessories(accessories); }

    public int deleteById(Long id) { return accessoriesMapper.deleteById(id); }

    public List<Accessories> getAll() { return accessoriesMapper.selectList(null); }

    public Accessories getById(Long id) { return accessoriesMapper.selectById(id); }

}
