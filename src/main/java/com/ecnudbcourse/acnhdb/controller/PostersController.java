package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Posters;
import com.ecnudbcourse.acnhdb.service.PostersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/posters")
public class PostersController {

    @Autowired
    private PostersService postersService;

    @GetMapping
    public List<Posters> getAll() { return postersService.getAll(); }

    @GetMapping("/{id}")
    public Posters getById(@PathVariable Long id) { return postersService.getById(id); }

    @GetMapping("/findByName")
    public List<Posters> findByName(@RequestParam String name) { return postersService.findByName(name); }


    @GetMapping("/searchColor1")
    public List<Posters> searchPostersByColor1(@RequestParam(required = false) String color1) {
        return postersService.searchPostersByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Posters> searchPostersByColor2(@RequestParam(required = false) String color2) {
        return postersService.searchPostersByColor2(color2);
    }

    @GetMapping("/searchSourceNotes")
    public List<Posters> searchPostersBySourceNotes(@RequestParam(required = false) String sourceNotes) {
        return postersService.searchPostersBySourceNotes(sourceNotes);
    }
}
