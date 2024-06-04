package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Miscellaneous;
import com.ecnudbcourse.acnhdb.service.MiscellaneousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/miscellaneous")
public class MiscellaneousController {

    @Autowired
    private MiscellaneousService miscellaneousService;

    @GetMapping
    public List<Miscellaneous> getAll() { return miscellaneousService.getAll(); }

    @GetMapping("/{id}")
    public Miscellaneous getById(@PathVariable Long id) { return miscellaneousService.getById(id); }

    @GetMapping("/findByName")
    public List<Miscellaneous> findByName(@RequestParam String name) { return miscellaneousService.findByName(name); }

}
