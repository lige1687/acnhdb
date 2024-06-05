package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Miscellaneous;
import com.ecnudbcourse.acnhdb.mapper.MiscellaneousMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MiscellaneousService {

    @Autowired
    private MiscellaneousMapper miscellaneousMapper;

    public List<Miscellaneous> findByName(String name) { return miscellaneousMapper.findByName(name); }

    public int insertMiscellaneous(Miscellaneous miscellaneous) { return miscellaneousMapper.insertMiscellaneous(miscellaneous); }

    public int updateMiscellaneous(Miscellaneous miscellaneous) { return miscellaneousMapper.updateMiscellaneous(miscellaneous); }

    public int deleteById(Long id) { return miscellaneousMapper.deleteById(id); }

    public List<Miscellaneous> getAll() { return miscellaneousMapper.selectList(null); }

    public Miscellaneous getById(Long id) { return miscellaneousMapper.selectById(id); }

}
