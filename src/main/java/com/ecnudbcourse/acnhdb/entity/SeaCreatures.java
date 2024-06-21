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
}
