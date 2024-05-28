package com.ecnudbcourse.acnhdb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecnudbcourse.acnhdb.entity.Houseware;
import com.ecnudbcourse.acnhdb.repository.HousewareRepository;

import java.util.List;

@Service
public class HousewareService {

    @Autowired
    private HousewareRepository housewareRepository;

    public List<Houseware> getAllHousewares() {
        return housewareRepository.findAll();
    }

    public Houseware getHousewareById(Integer id) {
        return housewareRepository.findById(Long.valueOf(id)).orElse(null);
    }
}

