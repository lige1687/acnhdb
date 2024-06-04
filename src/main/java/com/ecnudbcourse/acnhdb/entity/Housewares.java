package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;



@Data
@TableName("housewares")    // MyBatis Plus 注解，指定表名
public class Housewares {

    // Getter and Setter methods
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;
    private String bodyTitle;
    private String pattern;
    private String patternTitle;
    private String diy;
    private String bodyCustomize;
    private String patternCustomize;
    private Integer kitCost;
    private Integer buyPrice;
    private Integer sellPrice;
    private Integer milesPrice;
    private String color_1;
    private String color_2;
    private String size;
    private String interact;
    private String tag;
    private String outdoor;
    private String source;
    private String sourceNotes;
    private String hhaConcept_1;
    private String hhaConcept_2;
    private String hhaSeries;
    private String hhaSet;
    private String speakerType;
    private String lightingType;
}
