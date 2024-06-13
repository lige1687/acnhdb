package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("fish")
public class Fish {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer sell;

    @TableField("Where_How")
    private String whereHow;

    private String shadow;

    @TableField("Total_Catches_to_Unlock")
    private Integer totalCatchesToUnlock;

    @TableField("Spawn_Rates")
    private String spawnRates;

    @TableField("Rain_Snow_Catch_Up")
    private String rainSnowCatchUp;

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

    private String size;

    @TableField("Lighting_Type")
    private String lightingType;
    public String getTimeRange(String month) {
        switch (month) {
            case "NH_Jan": return nhJan;
            case "NH_Feb": return nhFeb;
            case "NH_Mar": return nhMar;
            case "NH_Apr": return nhApr;
            case "NH_May": return nhMay;
            case "NH_Jun": return nhJun;
            case "NH_Jul": return nhJul;
            case "NH_Aug": return nhAug;
            case "NH_Sep": return nhSep;
            case "NH_Oct": return nhOct;
            case "NH_Nov": return nhNov;
            case "NH_Dec": return nhDec;
            case "SH_Jan": return shJan;
            case "SH_Feb": return shFeb;
            case "SH_Mar": return shMar;
            case "SH_Apr": return shApr;
            case "SH_May": return shMay;
            case "SH_Jun": return shJun;
            case "SH_Jul": return shJul;
            case "SH_Aug": return shAug;
            case "SH_Sep": return shSep;
            case "SH_Oct": return shOct;
            case "SH_Nov": return shNov;
            case "SH_Dec": return shDec;
            default: return shJun;
        }
    }
}