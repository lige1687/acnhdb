package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Achievements;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface AchievementsMapper extends BaseMapper<Achievements> {

    @Select("SELECT * FROM achievements WHERE name = #{name}")
    List<Achievements> findByName(@Param("name") String name);

    @Insert("INSERT INTO achievements (Name, Award_Criteria, Internal_Category, Num_of_Tiers, Tier_1, Tier_2, Tier_3, Tier_4, Tier_5, Reward_Tier_1, Reward_Tier_2, Reward_Tier_3, Reward_Tier_4, Reward_Tier_5, Reward_Tier_6, Sequential) VALUES (#{name}, #{awardCriteria}, #{internalCategory}, #{numOfTiers}, #{tier_1}, #{tier_2}, #{tier_3}, #{tier_4}, #{tier_5}, #{rewardTier_1}, #{rewardTier_2}, #{rewardTier_3}, #{rewardTier_4}, #{rewardTier_5}, #{rewardTier_6}, #{sequential})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertAchievements(Achievements achievements);

    @Update("UPDATE achievements SET Name = #{name}, Award_Criteria = #{awardCriteria}, Internal_Category = #{internalCategory}, Num_of_Tiers = #{numOfTiers}, Tier_1 = #{tier_1}, Tier_2 = #{tier_2}, Tier_3 = #{tier_3}, Tier_4 = #{tier_4}, Tier_5 = #{tier_5}, Reward_Tier_1 = #{rewardTier_1}, Reward_Tier_2 = #{rewardTier_2}, Reward_Tier_3 = #{rewardTier_3}, Reward_Tier_4 = #{rewardTier_4}, Reward_Tier_5 = #{rewardTier_5}, Reward_Tier_6 = #{rewardTier_6}, Sequential = #{sequential} WHERE id = #{id}")
    int updateAchievements(Achievements achievements);

    @Delete("DELETE FROM achievements WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
