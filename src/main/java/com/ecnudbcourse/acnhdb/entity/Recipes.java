package com.ecnudbcourse.acnhdb.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("recipes") // 假设表名为 "recipes"
public class Recipes {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer material1Count;
    private String material1;
    private Integer material2Count;
    private String material2;
    private Integer material3Count;
    private String material3;
    private Integer material4Count;
    private String material4;
    private Integer material5Count;
    private String material5;
    private Integer material6Count;
    private String material6;
    private String recipesToUnlock;
    private String category;
}
