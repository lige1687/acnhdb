package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Tool;
import com.ecnudbcourse.acnhdb.mapper.ToolMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ToolService {

    @Autowired
    private ToolMapper toolMapper;

    public List<Tool> findByName(String name) {
        return toolMapper.findByName(name);
    }

    public int insertTool(Tool tool) {
        return toolMapper.insertTool(tool);
    }

    public int updateTool(Tool tool) {
        return toolMapper.updateTool(tool);
    }

    public int deleteById(Long id) {
        return toolMapper.deleteById(id);
    }
}
