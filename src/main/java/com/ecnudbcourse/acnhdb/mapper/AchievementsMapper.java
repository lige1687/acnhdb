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

}
