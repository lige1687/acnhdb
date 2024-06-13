package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.dto.HouseWareMaterials;
import com.ecnudbcourse.acnhdb.entity.Housewares;
import com.ecnudbcourse.acnhdb.service.HousewaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/housewares")
public class HousewaresController {

    @Autowired
    private HousewaresService housewaresService;

    @GetMapping
    public List<Housewares> getAll() {
        return housewaresService.getAll();
    }

    @GetMapping("/{id}")
    public Housewares getById(@PathVariable Long id) {
        return housewaresService.getById(id);
    }

    @GetMapping("/findByName")
    public List<Housewares> findByName(@RequestParam String name) {
        return housewaresService.findByName(name);
    }

    @GetMapping("/materials")
    public List<HouseWareMaterials> getHouseWareMaterialsByName(@RequestParam String name) {
        return housewaresService.getHouseWareMaterialsByName(name);
    }
    /*
    @PostMapping
    public void save(@RequestBody Housewares housewares) {
        housewaresService.insertHouseWare(housewares);
    }

    @PutMapping
    public void update(@RequestBody Housewares housewares) {
        housewaresService.updateHouseWare(housewares);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        housewaresService.deleteById(id);
    }
     */
}
