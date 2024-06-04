package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Headwear;
import com.ecnudbcourse.acnhdb.service.HeadwearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/headwear")
public class HeadwearController {

    @Autowired
    private HeadwearService headwearService;

    @GetMapping
    public List<Headwear> getAll() { return headwearService.getAll(); }

    @GetMapping("/{id}")
    public Headwear getById(@PathVariable Long id) { return headwearService.getById(id); }

    @GetMapping("/findByName")
    public List<Headwear> findByName(@RequestParam String name) { return headwearService.findByName(name); }

}
