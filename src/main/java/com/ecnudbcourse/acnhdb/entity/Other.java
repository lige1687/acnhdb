package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("other")
public class Other {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String diy;

    @TableField("Stack_Size")
    private Integer stackSize;

    private Integer buy;
    private Integer sell;

    @TableField("Miles_Price")
    private Integer milesPrice;

    private String source;

    @TableField("Source_Notes")
    private String sourceNotes;

    private String tag;

    @TableField("Color_1")
    private String color_1;

    @TableField("Color_2")
    private String color_2;
}