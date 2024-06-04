package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Achievements;
import com.ecnudbcourse.acnhdb.mapper.AchievementsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AchievementsService {

    @Autowired
    private AchievementsMapper achievementsMapper;

    public List<Achievements> findByName(String name) { return achievementsMapper.findByName(name); }

    public int insertAchievements(Achievements achievements) { return achievementsMapper.insertAchievements(achievements); }

    public int updateAchievements(Achievements achievements) { return achievementsMapper.updateAchievements(achievements); }

    public int deleteById(Long id) { return achievementsMapper.deleteById(id); }

    public List<Achievements> getAll() { return achievementsMapper.selectList(null); }

    public Achievements getById(Long id) { return achievementsMapper.selectById(id); }

}
