package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dress_up")
public class DressUp {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;
    private String diy;
    private Integer buy;
    private Integer sell;
    @TableField("Color_1")
    private String color_1;
    @TableField("Color_1")
    private String color_2;
    private String source;
    @TableField("Source_Notes")
    private String sourceNotes;
    @TableField("Seasonal_Availability")
    private String seasonalAvailability;
    @TableField("Mannequin_Piece")
    private String mannequinPiece;
    private String style;
    @TableField("Label_Themes")
    private String labelThemes;
    private String catalog;
    @TableField("Primary_Shape")
    private String primaryShape;
    @TableField("Secondary_Shape")
    private String secondaryShape;
}
