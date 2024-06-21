package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Tools;
import com.ecnudbcourse.acnhdb.mapper.ToolsMapper;
import com.ecnudbcourse.acnhdb.dto.ToolsMaterials;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToolsService {

    @Autowired
    private ToolsMapper toolsMapper;

    public List<Tools> findByName(String name) { return toolsMapper.findByName(name); }

    public int insertTools(Tools tools) { return toolsMapper.insertTools(tools); }

    public int updateTools(Tools tools) { return toolsMapper.updateTools(tools); }

    public int deleteById(Long id) { return toolsMapper.deleteById(id); }

    public List<Tools> getAll() { return toolsMapper.selectList(null); }

    public Tools getById(Long id) { return toolsMapper.selectById(id); }


    public List<Tools> searchToolsByBuyRangeAndSort(Integer min, Integer max, String sort) {
        return toolsMapper.searchByBuyRangeAndSort(min, max, sort);
    }

    public List<Tools> searchToolsBySellRangeAndSort(Integer min, Integer max, String sort) {
        return toolsMapper.searchBySellRangeAndSort(min, max, sort);
    }

    public List<Tools> searchToolsByMilesPriceRangeAndSort(Integer min, Integer max, String sort) {
        return toolsMapper.searchByMilesPriceRangeAndSort(min, max, sort);
    }

    public List<Tools> searchToolsByKitCostRangeAndSort(Integer min, Integer max, String sort) {
        return toolsMapper.searchByKitCostRangeAndSort(min, max, sort);
    }

    public List<Tools> searchToolsByDiy(String diy) {
        return toolsMapper.findByDiy(diy);
    }

    public List<ToolsMaterials> getToolsMaterialsByName(String name) {
        List<ToolsMaterials> materials = toolsMapper.selectToolsMaterialsByName(name);
        Set<ToolsMaterials> uniqueMaterials = materials.stream().collect(Collectors.toSet());
        return List.copyOf(uniqueMaterials);
    }
}
