package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.WallMounted;
import com.ecnudbcourse.acnhdb.service.WallMountedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/wall_mounted")
public class WallMountedController {

    @Autowired
    private WallMountedService wall_mountedService;

    @GetMapping
    public List<WallMounted> getAll() { return wall_mountedService.getAll(); }

    @GetMapping("/{id}")
    public WallMounted getById(@PathVariable Long id) { return wall_mountedService.getById(id); }

    @GetMapping("/findByName")
    public List<WallMounted> findByName(@RequestParam String name) { return wall_mountedService.findByName(name); }

}
