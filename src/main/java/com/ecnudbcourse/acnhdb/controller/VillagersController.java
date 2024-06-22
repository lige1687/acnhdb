package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Villagers;
import com.ecnudbcourse.acnhdb.service.VillagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

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


    @GetMapping("/search")
    public List<Villagers> searchVillagers(@RequestParam(required = false) String species,
                                           @RequestParam(required = false) String gender,
                                           @RequestParam(required = false) String personality,
                                           @RequestParam(required = false) String hobby,
                                           @RequestParam(required = false) String birthday)

    {

        return villagersService.findVillagers(species, gender, personality,  hobby,birthday );
    }


    @GetMapping("/searchCatchphrase")
    public List<Villagers> searchVillagersByCatchphrase(@RequestParam(required = false) String catchphrase) {
        return villagersService.searchVillagersByCatchphrase(catchphrase);
    }

    @GetMapping("/searchFavoriteSong")
    public List<Villagers> searchVillagersByFavoriteSong(@RequestParam(required = false) String favoriteSong) {
        return villagersService.searchVillagersByFavoriteSong(favoriteSong);
    }

    @GetMapping("/searchStyle1")
    public List<Villagers> searchVillagersByStyle1(@RequestParam(required = false) String style1) {
        return villagersService.searchVillagersByStyle1(style1);
    }

    @GetMapping("/searchStyle2")
    public List<Villagers> searchVillagersByStyle2(@RequestParam(required = false) String style2) {
        return villagersService.searchVillagersByStyle2(style2);
    }

    @GetMapping("/searchColor1")
    public List<Villagers> searchVillagersByColor1(@RequestParam(required = false) String color1) {
        return villagersService.searchVillagersByColor1(color1);
    }

    @GetMapping("/searchColor2")
    public List<Villagers> searchVillagersByColor2(@RequestParam(required = false) String color2) {
        return villagersService.searchVillagersByColor2(color2);
    }

    @GetMapping("/searchWallpaper")
    public List<Villagers> searchVillagersByWallpaper(@RequestParam(required = false) String wallpaper) {
        return villagersService.searchVillagersByWallpaper(wallpaper);
    }

    @GetMapping("/searchFlooring")
    public List<Villagers> searchVillagersByFlooring(@RequestParam(required = false) String flooring) {
        return villagersService.searchVillagersByFlooring(flooring);
    }
}
