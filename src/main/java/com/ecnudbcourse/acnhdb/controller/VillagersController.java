package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Villagers;
import com.ecnudbcourse.acnhdb.service.VillagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/villagers")
public class VillagersController {

    @Autowired
    private VillagersService villagersService;

    @GetMapping
    public List<Villagers> getAll() { return villagersService.getAll(); }

    @GetMapping("/{id}")
    public Villagers getById(@PathVariable Long id) { return villagersService.getById(id); }

    @GetMapping("/findByName")
    public List<Villagers> findByName(@RequestParam String name) { return villagersService.findByName(name); }


    // 前段的url类似于 GET /api/villagers/search?species=Cat&gender=Male&personality=Lazy&birthday=12/01&hobby=Music
    //参数都是可选的哦
    @GetMapping("/search")
    public List<Villagers> searchVillagers(@RequestParam(required = false) String species,
                                           @RequestParam(required = false) String gender,
                                           @RequestParam(required = false) String personality,
                                           @RequestParam(required = false) String hobby,
                                           @RequestParam(required = false) String birthdayMonth)

    {
        return villagersService.findVillagers(species, gender, personality,  hobby, birthdayMonth);
    }
    //http://localhost:8080/api/villagers/search?species=cat
}
