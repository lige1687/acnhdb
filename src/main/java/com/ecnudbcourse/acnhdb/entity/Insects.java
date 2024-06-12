package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("insects")
public class Insects {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer sell;

    @TableField("Where_How")
    private String whereHow;

    private String weather;

    @TableField("Total_Catches_To_Unlock")
    private Integer totalCatchesToUnlock;

    @TableField("Spawn_Rates")
    private Integer spawnRates;

    @TableField("NH_Jan")
    private String nhJan;

    @TableField("NH_Feb")
    private String nhFeb;

    @TableField("NH_Mar")
    private String nhMar;

    @TableField("NH_Apr")
    private String nhApr;

    @TableField("NH_May")
    private String nhMay;

    @TableField("NH_Jun")
    private String nhJun;

    @TableField("NH_Jul")
    private String nhJul;

    @TableField("NH_Aug")
    private String nhAug;

    @TableField("NH_Sep")
    private String nhSep;

    @TableField("NH_Oct")
    private String nhOct;

    @TableField("NH_Nov")
    private String nhNov;

    @TableField("NH_Dec")
    private String nhDec;

    @TableField("SH_Jan")
    private String shJan;

    @TableField("SH_Feb")
    private String shFeb;

    @TableField("SH_Mar")
    private String shMar;

    @TableField("SH_Apr")
    private String shApr;

    @TableField("SH_May")
    private String shMay;

    @TableField("SH_Jun")
    private String shJun;

    @TableField("SH_Jul")
    private String shJul;

    @TableField("SH_Aug")
    private String shAug;

    @TableField("SH_Sep")
    private String shSep;

    @TableField("SH_Oct")
    private String shOct;

    @TableField("SH_Nov")
    private String shNov;

    @TableField("SH_Dec")
    private String shDec;

    @TableField("Color_1")
    private String color_1;

    @TableField("Color_2")
    private String color_2;
}
