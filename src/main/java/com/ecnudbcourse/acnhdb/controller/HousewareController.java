package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Houseware;
import com.ecnudbcourse.acnhdb.service.HousewareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/housewares")
public class HousewareController {

    @Autowired
    private HousewareService housewareService;

    @GetMapping
    public List<Houseware> getAllHousewares() {
        return housewareService.getAllHousewares();
    }

    @GetMapping("/{id}")
    public Houseware getHousewareById(@PathVariable Integer id) {
        return housewareService.getHousewareById(id);
    }

}

