package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Photos;
import com.ecnudbcourse.acnhdb.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

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


    @GetMapping("/searchVariation")
    public List<Photos> searchPhotosByVariation(@RequestParam(required = false) String variation) {
        return photosService.searchPhotosByVariation(variation);
    }

    @GetMapping("/searchColor1")
    public List<Photos> searchPhotosByColor1(@RequestParam(required = false) String color1) {
        return photosService.searchPhotosByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Photos> searchPhotosByColor2(@RequestParam(required = false) String color2) {
        return photosService.searchPhotosByColor2(color2);
    }
}
