package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Construction;
import com.ecnudbcourse.acnhdb.service.ConstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/construction")
public class ConstructionController {

    @Autowired
    private ConstructionService constructionService;

    @GetMapping
    public List<Construction> getAll() { return constructionService.getAll(); }

    @GetMapping("/{id}")
    public Construction getById(@PathVariable Long id) { return constructionService.getById(id); }

    @GetMapping("/findByName")
    public List<Construction> findByName(@RequestParam String name) { return constructionService.findByName(name); }

}
