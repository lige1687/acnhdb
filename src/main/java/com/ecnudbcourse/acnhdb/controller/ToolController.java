package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Tool;
import com.ecnudbcourse.acnhdb.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tools")
public class ToolController {

    @Autowired
    private ToolService toolService;

    @GetMapping("/findByName")
    public List<Tool> findByName(@RequestParam String name) {
        return toolService.findByName(name);
    }

    @PostMapping("/insert")
    public int insertTool(@RequestBody Tool tool) {
        return toolService.insertTool(tool);
    }

    @PutMapping("/update")
    public int updateTool(@RequestBody Tool tool) {
        return toolService.updateTool(tool);
    }

    @DeleteMapping("/delete")
    public int deleteById(@RequestParam Long id) {
        return toolService.deleteById(id);
    }
}
