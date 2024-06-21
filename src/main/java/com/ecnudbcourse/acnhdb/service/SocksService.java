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
}
