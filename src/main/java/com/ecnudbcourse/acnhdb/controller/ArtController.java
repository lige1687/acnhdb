package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Art;
import com.ecnudbcourse.acnhdb.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/art")
public class ArtController {

    @Autowired
    private ArtService artService;

    @GetMapping
    public List<Art> getAll() { return artService.getAll(); }

    @GetMapping("/{id}")
    public Art getById(@PathVariable Long id) { return artService.getById(id); }

    @GetMapping("/findByName")
    public List<Art> findByName(@RequestParam String name) { return artService.findByName(name); }

}
