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


    public List<Achievements> searchAchievementsByAwardCriteria(String awardCriteria) {
        return achievementsMapper.findByAwardCriteria(awardCriteria);
    }

    public List<Achievements> searchAchievementsByInternalCategory(String internalCategory) {
        return achievementsMapper.findByInternalCategory(internalCategory);
    }

    public List<Achievements> searchAchievementsByNumOfTiers(String numOfTiers) {
        return achievementsMapper.findByNumOfTiers(numOfTiers);
    }

    public List<Achievements> searchAchievementsByTier1(String tier1) {
        return achievementsMapper.findByTier1(tier1);
    }

    public List<Achievements> searchAchievementsByTier2(String tier2) {
        return achievementsMapper.findByTier2(tier2);
    }

    public List<Achievements> searchAchievementsByTier3(String tier3) {
        return achievementsMapper.findByTier3(tier3);
    }

    public List<Achievements> searchAchievementsByTier4(String tier4) {
        return achievementsMapper.findByTier4(tier4);
    }

    public List<Achievements> searchAchievementsByTier5(String tier5) {
        return achievementsMapper.findByTier5(tier5);
    }

    public List<Achievements> searchAchievementsByRewardTier1(String rewardTier1) {
        return achievementsMapper.findByRewardTier1(rewardTier1);
    }

    public List<Achievements> searchAchievementsByRewardTier2(String rewardTier2) {
        return achievementsMapper.findByRewardTier2(rewardTier2);
    }

    public List<Achievements> searchAchievementsByRewardTier3(String rewardTier3) {
        return achievementsMapper.findByRewardTier3(rewardTier3);
    }

    public List<Achievements> searchAchievementsByRewardTier4(String rewardTier4) {
        return achievementsMapper.findByRewardTier4(rewardTier4);
    }

    public List<Achievements> searchAchievementsByRewardTier5(String rewardTier5) {
        return achievementsMapper.findByRewardTier5(rewardTier5);
    }

    public List<Achievements> searchAchievementsByRewardTier6(String rewardTier6) {
        return achievementsMapper.findByRewardTier6(rewardTier6);
    }

    public List<Achievements> searchAchievementsBySequential(String sequential) {
        return achievementsMapper.findBySequential(sequential);
    }
}
