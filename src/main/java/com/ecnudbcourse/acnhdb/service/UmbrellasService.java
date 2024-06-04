package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Umbrellas;
import com.ecnudbcourse.acnhdb.mapper.UmbrellasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UmbrellasService {

    @Autowired
    private UmbrellasMapper umbrellasMapper;

    public List<Umbrellas> findByName(String name) { return umbrellasMapper.findByName(name); }

    public int insertUmbrellas(Umbrellas umbrellas) { return umbrellasMapper.insertUmbrellas(umbrellas); }

    public int updateUmbrellas(Umbrellas umbrellas) { return umbrellasMapper.updateUmbrellas(umbrellas); }

    public int deleteById(Long id) { return umbrellasMapper.deleteById(id); }

    public List<Umbrellas> getAll() { return umbrellasMapper.selectList(null); }

    public Umbrellas getById(Long id) { return umbrellasMapper.selectById(id); }

}
