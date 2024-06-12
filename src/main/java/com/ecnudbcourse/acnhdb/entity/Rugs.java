package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rugs")

public class Rugs {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String diy;
    private Integer buy;
    private Integer sell;

    @TableField("Color_1")
    private String color_1;

    @TableField("Color_2")
    private String color_2;

    private String size;

    @TableField("Miles_Price")
    private Integer milesPrice;

    private String source;

    @TableField("Source_Notes")
    private String sourceNotes;

    @TableField("HHA_Concept_1")
    private String hhaConcept_1;

    @TableField("HHA_Concept_2")
    private String hhaConcept_2;

    @TableField("HHA_Series")
    private String hhaSeries;

    private String tag;
    private String catalog;
}