package com.ecnudbcourse.acnhdb.controller;

import com.ecnudbcourse.acnhdb.entity.Achievements;
import com.ecnudbcourse.acnhdb.service.AchievementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/achievements")
public class AchievementsController {

    @Autowired
    private AchievementsService achievementsService;

    @GetMapping
    public List<Achievements> getAll() { return achievementsService.getAll(); }

    @GetMapping("/{id}")
    public Achievements getById(@PathVariable Long id) { return achievementsService.getById(id); }

    @GetMapping("/findByName")
    public List<Achievements> findByName(@RequestParam String name) { return achievementsService.findByName(name); }


    @GetMapping("/searchAwardCriteria")
    public List<Achievements> searchAchievementsByAwardCriteria(@RequestParam(required = false) String awardCriteria) {
        return achievementsService.searchAchievementsByAwardCriteria(awardCriteria);
    }

    @GetMapping("/searchInternalCategory")
    public List<Achievements> searchAchievementsByInternalCategory(@RequestParam(required = false) String internalCategory) {
        return achievementsService.searchAchievementsByInternalCategory(internalCategory);
    }

    @GetMapping("/searchNumOfTiers")
    public List<Achievements> searchAchievementsByNumOfTiers(@RequestParam(required = false) String numOfTiers) {
        return achievementsService.searchAchievementsByNumOfTiers(numOfTiers);
    }

    @GetMapping("/searchTier1")
    public List<Achievements> searchAchievementsByTier1(@RequestParam(required = false) String tier1) {
        return achievementsService.searchAchievementsByTier1(tier1);
    }

    @GetMapping("/searchTier2")
    public List<Achievements> searchAchievementsByTier2(@RequestParam(required = false) String tier2) {
        return achievementsService.searchAchievementsByTier2(tier2);
    }

    @GetMapping("/searchTier3")
    public List<Achievements> searchAchievementsByTier3(@RequestParam(required = false) String tier3) {
        return achievementsService.searchAchievementsByTier3(tier3);
    }

    @GetMapping("/searchTier4")
    public List<Achievements> searchAchievementsByTier4(@RequestParam(required = false) String tier4) {
        return achievementsService.searchAchievementsByTier4(tier4);
    }

    @GetMapping("/searchTier5")
    public List<Achievements> searchAchievementsByTier5(@RequestParam(required = false) String tier5) {
        return achievementsService.searchAchievementsByTier5(tier5);
    }

    @GetMapping("/searchRewardTier1")
    public List<Achievements> searchAchievementsByRewardTier1(@RequestParam(required = false) String rewardTier1) {
        return achievementsService.searchAchievementsByRewardTier1(rewardTier1);
    }

    @GetMapping("/searchRewardTier2")
    public List<Achievements> searchAchievementsByRewardTier2(@RequestParam(required = false) String rewardTier2) {
        return achievementsService.searchAchievementsByRewardTier2(rewardTier2);
    }

    @GetMapping("/searchRewardTier3")
    public List<Achievements> searchAchievementsByRewardTier3(@RequestParam(required = false) String rewardTier3) {
        return achievementsService.searchAchievementsByRewardTier3(rewardTier3);
    }

    @GetMapping("/searchRewardTier4")
    public List<Achievements> searchAchievementsByRewardTier4(@RequestParam(required = false) String rewardTier4) {
        return achievementsService.searchAchievementsByRewardTier4(rewardTier4);
    }

    @GetMapping("/searchRewardTier5")
    public List<Achievements> searchAchievementsByRewardTier5(@RequestParam(required = false) String rewardTier5) {
        return achievementsService.searchAchievementsByRewardTier5(rewardTier5);
    }

    @GetMapping("/searchRewardTier6")
    public List<Achievements> searchAchievementsByRewardTier6(@RequestParam(required = false) String rewardTier6) {
        return achievementsService.searchAchievementsByRewardTier6(rewardTier6);
    }

    @GetMapping("/searchSequential")
    public List<Achievements> searchAchievementsBySequential(@RequestParam(required = false) String sequential) {
        return achievementsService.searchAchievementsBySequential(sequential);
    }
}
