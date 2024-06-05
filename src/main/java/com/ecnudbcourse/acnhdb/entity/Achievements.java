package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
    private Integer tier_1;
    private Integer tier_2;
    private Integer tier_3;
    private Integer tier_4;
    private Integer tier_5;
    private Integer rewardTier_1;
    private Integer rewardTier_2;
    private Integer rewardTier_3;
    private Integer rewardTier_4;
    private Integer rewardTier_5;
    private Integer rewardTier_6;
    private String sequential;
}
