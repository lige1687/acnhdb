package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
    private String vfxType;
    private String diy;
    private Integer buy;
    private Integer sell;
    private String color_1;
    private String color_2;
    private Integer milesPrice;
    private String source;
    private String sourceNotes;
    private String catalog;
    private String windowType;
    private String windowColor;
    private String paneType;
    private String curtainType;
    private String curtainColor;
    private String ceilingType;
    private String hhaConcept_1;
    private String hhaConcept_2;
    private String hhaSeries;
    private String tag;
}
