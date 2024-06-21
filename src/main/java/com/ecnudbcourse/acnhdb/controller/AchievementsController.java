package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Achievements;
import com.ecnudbcourse.acnhdb.service.AchievementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/achievements")
public class AchievementsController {

    @Autowired
    private AchievementsService achievementsService;

    @GetMapping
    public List<Achievements> getAll() { return achievementsService.getAll(); }

    @GetMapping("/{id}")
    public Achievements getById(@PathVariable Long id) { return achievementsService.getById(id); }

    @GetMapping("/findByName")
    public List<Achievements> findByName(@RequestParam String name) { return achievementsService.findByName(name); }

}
