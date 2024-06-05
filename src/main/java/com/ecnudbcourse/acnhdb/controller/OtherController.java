package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Other;
import com.ecnudbcourse.acnhdb.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/other")
public class OtherController {

    @Autowired
    private OtherService otherService;

    @GetMapping
    public List<Other> getAll() { return otherService.getAll(); }

    @GetMapping("/{id}")
    public Other getById(@PathVariable Long id) { return otherService.getById(id); }

    @GetMapping("/findByName")
    public List<Other> findByName(@RequestParam String name) { return otherService.findByName(name); }

}
