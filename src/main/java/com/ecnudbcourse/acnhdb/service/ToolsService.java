package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Recipes;
import com.ecnudbcourse.acnhdb.entity.Tools;
import com.ecnudbcourse.acnhdb.mapper.ToolsMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ToolsService {

    @Autowired
    private ToolsMapper toolsMapper;

    public List<Tools> getAll() {
        return toolsMapper.selectList(null);
    }

    public List<Tools> findByName(String name) {
        return toolsMapper.findByName(name);
    }

    public int insertTool(Tools tools) {
        return toolsMapper.insertTool(tools);
    }

    public int updateTool(Tools tools) {
        return toolsMapper.updateTool(tools);
    }

    public int deleteById(Long id) {
        return toolsMapper.deleteById(id);
    }
}
