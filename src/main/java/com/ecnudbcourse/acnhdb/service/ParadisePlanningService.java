package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.ParadisePlanning;
import com.ecnudbcourse.acnhdb.mapper.ParadisePlanningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParadisePlanningService {

    @Autowired
    private ParadisePlanningMapper paradise_planningMapper;

    public List<ParadisePlanning> findByName(String name) { return paradise_planningMapper.findByName(name); }

    public int insertParadisePlanning(ParadisePlanning paradise_planning) { return paradise_planningMapper.insertParadisePlanning(paradise_planning); }

    public int updateParadisePlanning(ParadisePlanning paradise_planning) { return paradise_planningMapper.updateParadisePlanning(paradise_planning); }

    public int deleteById(Long id) { return paradise_planningMapper.deleteById(id); }

    public List<ParadisePlanning> getAll() { return paradise_planningMapper.selectList(null); }

    public ParadisePlanning getById(Long id) { return paradise_planningMapper.selectById(id); }


    public List<ParadisePlanning> searchParadisePlanningByRequest(String request) {
        return paradise_planningMapper.findByRequest(request);
    }

    public List<ParadisePlanning> searchParadisePlanningByThoughtBubble(String thoughtBubble) {
        return paradise_planningMapper.findByThoughtBubble(thoughtBubble);
    }

    public List<ParadisePlanning> searchParadisePlanningBySong(String song) {
        return paradise_planningMapper.findBySong(song);
    }

    public List<ParadisePlanning> searchParadisePlanningByFurnitureNameList(String furnitureNameList) {
        return paradise_planningMapper.findByFurnitureNameList(furnitureNameList);
    }
}
