package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
    private String whereHow;
    private String shadow;
    private Integer totalCatchesToUnlock;
    private String spawnRates;
    private String rainSnowCatchUp;
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
    private String color_1;
    private String color_2;
    private String size;
    private String lightingType;
}
