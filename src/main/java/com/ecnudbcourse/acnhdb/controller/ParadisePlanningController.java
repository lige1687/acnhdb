package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.ParadisePlanning;
import com.ecnudbcourse.acnhdb.service.ParadisePlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/paradise_planning")
public class ParadisePlanningController {

    @Autowired
    private ParadisePlanningService paradise_planningService;

    @GetMapping
    public List<ParadisePlanning> getAll() { return paradise_planningService.getAll(); }

    @GetMapping("/{id}")
    public ParadisePlanning getById(@PathVariable Long id) { return paradise_planningService.getById(id); }

    @GetMapping("/findByName")
    public List<ParadisePlanning> findByName(@RequestParam String name) { return paradise_planningService.findByName(name); }

}
