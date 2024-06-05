package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Photos;
import com.ecnudbcourse.acnhdb.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotosController {

    @Autowired
    private PhotosService photosService;

    @GetMapping
    public List<Photos> getAll() { return photosService.getAll(); }

    @GetMapping("/{id}")
    public Photos getById(@PathVariable Long id) { return photosService.getById(id); }

    @GetMapping("/findByName")
    public List<Photos> findByName(@RequestParam String name) { return photosService.findByName(name); }

}
