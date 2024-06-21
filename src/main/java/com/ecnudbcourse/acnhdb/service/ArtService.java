package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Art;
import com.ecnudbcourse.acnhdb.mapper.ArtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArtService {

    @Autowired
    private ArtMapper artMapper;

    public List<Art> findByName(String name) { return artMapper.findByName(name); }

    public int insertArt(Art art) { return artMapper.insertArt(art); }

    public int updateArt(Art art) { return artMapper.updateArt(art); }

    public int deleteById(Long id) { return artMapper.deleteById(id); }

    public List<Art> getAll() { return artMapper.selectList(null); }

    public Art getById(Long id) { return artMapper.selectById(id); }


    public List<Art> searchArtByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return artMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Art> searchArtBySellRangeAndSort(Integer min, Integer max, String sort) {
        return artMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Art> searchArtByGenuine(String genuine) {
        return artMapper.findByGenuine(genuine);
    }
}
