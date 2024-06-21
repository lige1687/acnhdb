package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("recipes")
public class Recipes {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer numberOfMaterial1;
    private String material1;
    private Integer numberOfMaterial2;
    private String material2;
    private Integer numberOfMaterial3;
    private String material3;
    private Integer numberOfMaterial4;
    private String material4;
    private Integer numberOfMaterial5;
    private String material5;
    private Integer numberOfMaterial6;
    private String material6;
    private Integer recipesToUnlock;
    private String category;
}
