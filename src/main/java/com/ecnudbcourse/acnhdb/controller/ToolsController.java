package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Tools;
import com.ecnudbcourse.acnhdb.service.ToolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tools")
public class ToolsController {

    @Autowired
    private ToolsService toolsService;

    @GetMapping
    public List<Tools> getAll() { return toolsService.getAll(); }

    @GetMapping("/{id}")
    public Tools getById(@PathVariable Long id) {
        return toolsService.getById(id);
    }

    @GetMapping("/findByName")
    public List<Tools> findByName(@RequestParam String name) {
        return toolsService.findByName(name);
    }

    /*
    @PostMapping("/insert")
    public int insertTool(@RequestBody Tools tools) {
        return toolsService.insertTool(tools);
    }

    @PutMapping("/update")
    public int updateTool(@RequestBody Tools tools) {
        return toolsService.updateTool(tools);
    }

    @DeleteMapping("/delete")
    public int deleteById(@RequestParam Long id) {
        return toolsService.deleteById(id);
    }
     */
}
