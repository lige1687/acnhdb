package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Umbrellas;
import com.ecnudbcourse.acnhdb.service.UmbrellasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/umbrellas")
public class UmbrellasController {

    @Autowired
    private UmbrellasService umbrellasService;

    @GetMapping
    public List<Umbrellas> getAll() { return umbrellasService.getAll(); }

    @GetMapping("/{id}")
    public Umbrellas getById(@PathVariable Long id) { return umbrellasService.getById(id); }

    @GetMapping("/findByName")
    public List<Umbrellas> findByName(@RequestParam String name) { return umbrellasService.findByName(name); }

}
