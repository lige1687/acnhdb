package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("wallpaper")
public class Wallpaper {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String vfx;

    @TableField("VFX_Type")
    private String vfxType;

    private String diy;
    private Integer buy;
    private Integer sell;

    @TableField("Color_1")
    private String color_1;

    @TableField("Color_2")
    private String color_2;

    @TableField("Miles_Price")
    private Integer milesPrice;

    private String source;

    @TableField("Source_Notes")
    private String sourceNotes;

    private String catalog;

    @TableField("Window_Type")
    private String windowType;

    @TableField("Window_Color")
    private String windowColor;

    @TableField("Pane_Type")
    private String paneType;

    @TableField("Curtain_Type")
    private String curtainType;

    @TableField("Curtain_Color")
    private String curtainColor;

    @TableField("Ceiling_Type")
    private String ceilingType;

    @TableField("HHA_Concept_1")
    private String hhaConcept_1;

    @TableField("HHA_Concept_2")
    private String hhaConcept_2;

    @TableField("HHA_Series")
    private String hhaSeries;

    private String tag;
}