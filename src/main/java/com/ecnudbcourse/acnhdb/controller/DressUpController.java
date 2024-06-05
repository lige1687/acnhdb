package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.DressUp;
import com.ecnudbcourse.acnhdb.service.DressUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dress_up")
public class DressUpController {

    @Autowired
    private DressUpService dress_upService;

    @GetMapping
    public List<DressUp> getAll() { return dress_upService.getAll(); }

    @GetMapping("/{id}")
    public DressUp getById(@PathVariable Long id) { return dress_upService.getById(id); }

    @GetMapping("/findByName")
    public List<DressUp> findByName(@RequestParam String name) { return dress_upService.findByName(name); }

}
