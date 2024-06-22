package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Socks;
import com.ecnudbcourse.acnhdb.mapper.SocksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SocksService {

    @Autowired
    private SocksMapper socksMapper;

    public List<Socks> findByName(String name) { return socksMapper.findByName(name); }

    public int insertSocks(Socks socks) { return socksMapper.insertSocks(socks); }

    public int updateSocks(Socks socks) { return socksMapper.updateSocks(socks); }

    public int deleteById(Long id) { return socksMapper.deleteById(id); }

    public List<Socks> getAll() { return socksMapper.selectList(null); }

    public Socks getById(Long id) { return socksMapper.selectById(id); }


    public List<Socks> searchSocksByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return socksMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Socks> searchSocksBySellRangeAndSort(Integer min, Integer max, String sort) {
        return socksMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Socks> searchSocksByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return socksMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Socks> searchSocksByVariation(String variation) {
        return socksMapper.findByVariation(variation);
    }

    public List<Socks> searchSocksByColor1(String color1) {
        return socksMapper.findByColor1(color1);
    }

    public List<Socks> searchSocksByColor2(String color2) {
        return socksMapper.findByColor2(color2);
    }

    public List<Socks> searchSocksBySource(String source) {
        return socksMapper.findBySource(source);
    }

    public List<Socks> searchSocksBySourceNotes(String sourceNotes) {
        return socksMapper.findBySourceNotes(sourceNotes);
    }

    public List<Socks> searchSocksBySeasonalAvailability(String seasonalAvailability) {
        return socksMapper.findBySeasonalAvailability(seasonalAvailability);
    }

    public List<Socks> searchSocksByMannequinPiece(String mannequinPiece) {
        return socksMapper.findByMannequinPiece(mannequinPiece);
    }

    public List<Socks> searchSocksByStyle(String style) {
        return socksMapper.findByStyle(style);
    }

    public List<Socks> searchSocksByLabelThemes(String labelThemes) {
        return socksMapper.findByLabelThemes(labelThemes);
    }

    public List<Socks> searchSocksByCatalog(String catalog) {
        return socksMapper.findByCatalog(catalog);
    }
}
