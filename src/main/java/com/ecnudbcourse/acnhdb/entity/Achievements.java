package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("achievements")
public class Achievements {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String awardCriteria;
    private String internalCategory;
    private Integer numOfTiers;
    @TableField("Tier_1")
    private Integer tier_1;
    @TableField("Tier_2")
    private Integer tier_2;
    @TableField("Tier_3")
    private Integer tier_3;
    @TableField("Tier_4")
    private Integer tier_4;
    @TableField("Tier_5")
    private Integer tier_5;
    @TableField(" Reward_Tier_1")
    private Integer rewardTier_1;
    @TableField(" Reward_Tier_2")
    private Integer rewardTier_2;
    @TableField(" Reward_Tier_3")
    private Integer rewardTier_3;
    @TableField(" Reward_Tier_4")
    private Integer rewardTier_4;
    @TableField(" Reward_Tier_5")
    private Integer rewardTier_5;
    @TableField(" Reward_Tier_6")
    private Integer rewardTier_6;
    private String sequential;
}
