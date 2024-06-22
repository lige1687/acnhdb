package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Achievements;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface AchievementsMapper extends BaseMapper<Achievements> {

    @Select("SELECT * FROM achievements WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Achievements> findByName(@Param("name") String name);

    @Insert("INSERT INTO achievements (Name, Award_Criteria, Internal_Category, Num_of_Tiers, Tier1, Tier2, Tier3, Tier4, Tier5, Reward_Tier1, Reward_Tier2, Reward_Tier3, Reward_Tier4, Reward_Tier5, Reward_Tier6, Sequential) VALUES (#{name}, #{awardCriteria}, #{internalCategory}, #{numOfTiers}, #{tier1}, #{tier2}, #{tier3}, #{tier4}, #{tier5}, #{rewardTier1}, #{rewardTier2}, #{rewardTier3}, #{rewardTier4}, #{rewardTier5}, #{rewardTier6}, #{sequential})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertAchievements(Achievements achievements);

    @Update("UPDATE achievements SET Name = #{name}, Award_Criteria = #{awardCriteria}, Internal_Category = #{internalCategory}, Num_of_Tiers = #{numOfTiers}, Tier1 = #{tier1}, Tier2 = #{tier2}, Tier3 = #{tier3}, Tier4 = #{tier4}, Tier5 = #{tier5}, Reward_Tier1 = #{rewardTier1}, Reward_Tier2 = #{rewardTier2}, Reward_Tier3 = #{rewardTier3}, Reward_Tier4 = #{rewardTier4}, Reward_Tier5 = #{rewardTier5}, Reward_Tier6 = #{rewardTier6}, Sequential = #{sequential} WHERE id = #{id}")
    int updateAchievements(Achievements achievements);

    @Delete("DELETE FROM achievements WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("SELECT * FROM achievements WHERE Award_Criteria LIKE CONCAT('%', #{awardCriteria}, '%')")
    List<Achievements> findByAwardCriteria(@Param("awardCriteria") String awardCriteria);

    @Select("SELECT * FROM achievements WHERE Internal_Category LIKE CONCAT('%', #{internalCategory}, '%')")
    List<Achievements> findByInternalCategory(@Param("internalCategory") String internalCategory);

    @Select("SELECT * FROM achievements WHERE Num_of_Tiers LIKE CONCAT('%', #{numOfTiers}, '%')")
    List<Achievements> findByNumOfTiers(@Param("numOfTiers") String numOfTiers);

    @Select("SELECT * FROM achievements WHERE Tier1 LIKE CONCAT('%', #{tier1}, '%')")
    List<Achievements> findByTier1(@Param("tier1") String tier1);

    @Select("SELECT * FROM achievements WHERE Tier2 LIKE CONCAT('%', #{tier2}, '%')")
    List<Achievements> findByTier2(@Param("tier2") String tier2);

    @Select("SELECT * FROM achievements WHERE Tier3 LIKE CONCAT('%', #{tier3}, '%')")
    List<Achievements> findByTier3(@Param("tier3") String tier3);

    @Select("SELECT * FROM achievements WHERE Tier4 LIKE CONCAT('%', #{tier4}, '%')")
    List<Achievements> findByTier4(@Param("tier4") String tier4);

    @Select("SELECT * FROM achievements WHERE Tier5 LIKE CONCAT('%', #{tier5}, '%')")
    List<Achievements> findByTier5(@Param("tier5") String tier5);

    @Select("SELECT * FROM achievements WHERE Reward_Tier1 LIKE CONCAT('%', #{rewardTier1}, '%')")
    List<Achievements> findByRewardTier1(@Param("rewardTier1") String rewardTier1);

    @Select("SELECT * FROM achievements WHERE Reward_Tier2 LIKE CONCAT('%', #{rewardTier2}, '%')")
    List<Achievements> findByRewardTier2(@Param("rewardTier2") String rewardTier2);

    @Select("SELECT * FROM achievements WHERE Reward_Tier3 LIKE CONCAT('%', #{rewardTier3}, '%')")
    List<Achievements> findByRewardTier3(@Param("rewardTier3") String rewardTier3);

    @Select("SELECT * FROM achievements WHERE Reward_Tier4 LIKE CONCAT('%', #{rewardTier4}, '%')")
    List<Achievements> findByRewardTier4(@Param("rewardTier4") String rewardTier4);

    @Select("SELECT * FROM achievements WHERE Reward_Tier5 LIKE CONCAT('%', #{rewardTier5}, '%')")
    List<Achievements> findByRewardTier5(@Param("rewardTier5") String rewardTier5);

    @Select("SELECT * FROM achievements WHERE Reward_Tier6 LIKE CONCAT('%', #{rewardTier6}, '%')")
    List<Achievements> findByRewardTier6(@Param("rewardTier6") String rewardTier6);

    @Select("SELECT * FROM achievements WHERE Sequential LIKE CONCAT('%', #{sequential}, '%')")
    List<Achievements> findBySequential(@Param("sequential") String sequential);
}
