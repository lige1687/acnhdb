package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shoes")

public class Shoes {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;
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

    @TableField("Seasonal_Availability")
    private String seasonalAvailability;

    @TableField("Mannequin_Piece")
    private String mannequinPiece;

    private String style;

    @TableField("Label_Themes")
    private String labelThemes;

    private String catalog;
}
