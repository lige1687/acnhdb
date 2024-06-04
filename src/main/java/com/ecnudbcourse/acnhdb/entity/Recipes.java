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
    private Integer numberOfMaterial_1;
    private String material_1;
    private Integer numberOfMaterial_2;
    private String material_2;
    private Integer numberOfMaterial_3;
    private String material_3;
    private Integer numberOfMaterial_4;
    private String material_4;
    private Integer numberOfMaterial_5;
    private String material_5;
    private Integer numberOfMaterial_6;
    private String material_6;
    private String recipesToUnlock;
    private String category;
}
