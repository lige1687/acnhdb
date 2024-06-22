package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sea_creatures")
public class SeaCreatures {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer sell;
    private String shadow;
    private String movementSpeed;
    private Integer totalCatchesToUnlock;
    private String spawnRates;
    private String nhJan;
    private String nhFeb;
    private String nhMar;
    private String nhApr;
    private String nhMay;
    private String nhJun;
    private String nhJul;
    private String nhAug;
    private String nhSep;
    private String nhOct;
    private String nhNov;
    private String nhDec;
    private String shJan;
    private String shFeb;
    private String shMar;
    private String shApr;
    private String shMay;
    private String shJun;
    private String shJul;
    private String shAug;
    private String shSep;
    private String shOct;
    private String shNov;
    private String shDec;
    private String surface;
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
            default: return null;
        }
    }
}
