package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Accessories;
import com.ecnudbcourse.acnhdb.service.AccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/accessories")
public class AccessoriesController {

    @Autowired
    private AccessoriesService accessoriesService;

    @GetMapping
    public List<Accessories> getAll() { return accessoriesService.getAll(); }

    @GetMapping("/{id}")
    public Accessories getById(@PathVariable Long id) { return accessoriesService.getById(id); }

    @GetMapping("/findByName")
    public List<Accessories> findByName(@RequestParam String name) { return accessoriesService.findByName(name); }

}
