package com.ecnudbcourse.acnhdb.controller;


import com.ecnudbcourse.acnhdb.dto.HouseWareMaterials;
import com.ecnudbcourse.acnhdb.entity.HouseWare;

import com.ecnudbcourse.acnhdb.service.HouseWareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/houseware")
public class HouseWareController {

    @Autowired
    private HouseWareService houseWareService;

    @GetMapping
    public List<HouseWare> getAll() {
        return houseWareService.getAll();
    }

    @GetMapping("/{id}")
    public HouseWare getById(@PathVariable Long id) {
        return houseWareService.getById(id);
    }

    @GetMapping("/findByName")
    public List<HouseWare> findByName(@RequestParam String name) {
        return houseWareService.findByName(name);
    }

    @PostMapping
    public void save(@RequestBody HouseWare houseWare) {
        houseWareService.insertHouseWare(houseWare);
    }

    @PutMapping
    public void update(@RequestBody HouseWare houseWare) {
        houseWareService.updateHouseWare(houseWare);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        houseWareService.deleteById(id);
    }

    @GetMapping("/{name}")
    public HouseWareMaterials getHousewareMaterialByName(@PathVariable String name) {
        return houseWareService.getHousewareMaterialByName(name);
    }
}
