package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Socks;
import com.ecnudbcourse.acnhdb.service.SocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/socks")
public class SocksController {

    @Autowired
    private SocksService socksService;

    @GetMapping
    public List<Socks> getAll() { return socksService.getAll(); }

    @GetMapping("/{id}")
    public Socks getById(@PathVariable Long id) { return socksService.getById(id); }

    @GetMapping("/findByName")
    public List<Socks> findByName(@RequestParam String name) { return socksService.findByName(name); }

}
