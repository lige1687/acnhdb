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
    private Integer tier1;
    private Integer tier2;
    private Integer tier3;
    private Integer tier4;
    private Integer tier5;
    private Integer rewardTier1;
    private Integer rewardTier2;
    private Integer rewardTier3;
    private Integer rewardTier4;
    private Integer rewardTier5;
    private Integer rewardTier6;
    private String sequential;
}
