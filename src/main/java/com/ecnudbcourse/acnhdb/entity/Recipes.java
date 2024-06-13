package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("recipes") // 假设表名为 "recipes"

public class Recipes {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    @TableField("Number_Of_Material_1")
    private Integer numberOfMaterial_1;

    @TableField("Material_1")
    private String material_1;

    @TableField("Number_Of_Material_2")
    private Integer numberOfMaterial_2;

    @TableField("Material_2")
    private String material_2;

    @TableField("Number_Of_Material_3")
    private Integer numberOfMaterial_3;

    @TableField("Material_3")
    private String material_3;

    @TableField("Number_Of_Material_4")
    private Integer numberOfMaterial_4;

    @TableField("Material_4")
    private String material_4;

    @TableField("Number_Of_Material_5")
    private Integer numberOfMaterial_5;

    @TableField("Material_5")
    private String material_5;

    @TableField("Number_Of_Material_6")
    private Integer numberOfMaterial_6;

    @TableField("Material_6")
    private String material_6;

    @TableField("Recipes_To_Unlock")
    private String recipesToUnlock;

    private String category;
}