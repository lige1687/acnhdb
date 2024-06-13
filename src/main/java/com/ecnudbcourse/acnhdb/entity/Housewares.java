package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("housewares")    // MyBatis Plus 注解，指定表名

public class Housewares {

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;

    @TableField("Body_Title")
    private String bodyTitle;

    private String pattern;

    @TableField("Pattern_Title")
    private String patternTitle;

    private String diy;

    @TableField("Body_Customize")
    private String bodyCustomize;

    @TableField("Pattern_Customize")
    private String patternCustomize;

    @TableField("Kit_Cost")
    private Integer kitCost;

    @TableField("Buy_Price")
    private Integer buyPrice;

    @TableField("Sell_Price")
    private Integer sellPrice;

    @TableField("Miles_Price")
    private Integer milesPrice;

    @TableField("Color_1")
    private String color_1;

    @TableField("Color_2")
    private String color_2;

    private String size;
    private String interact;
    private String tag;
    private String outdoor;
    private String source;

    @TableField("Source_Notes")
    private String sourceNotes;

    @TableField("HHA_Concept_1")
    private String hhaConcept_1;

    @TableField("HHA_Concept_2")
    private String hhaConcept_2;

    @TableField("HHA_Series")
    private String hhaSeries;

    @TableField("HHA_Set")
    private String hhaSet;

    @TableField("Speaker_Type")
    private String speakerType;

    @TableField("Lighting_Type")
    private String lightingType;

    public String getHhaConcept_1() { return hhaConcept_1; }
    public void setHhaConcept_1(String hhaConcept_1) { this.hhaConcept_1 = hhaConcept_1; }

    public String getHhaConcept_2() { return hhaConcept_2; }
    public void setHhaConcept_2(String hhaConcept_2) { this.hhaConcept_2 = hhaConcept_2; }

    public String getColor_1() { return color_1; }
    public void setColor_1(String color_1) { this.color_1 = color_1; }

    public String getColor_2() { return color_2; }
    public void setColor_2(String color_2) { this.color_2 = color_2; }
}
