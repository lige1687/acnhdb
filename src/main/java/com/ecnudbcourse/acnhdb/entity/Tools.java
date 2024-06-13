package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

@Data
@TableName("tools")

public class Tools {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;

    @TableField("Body_Title")
    private String bodyTitle;

    private String diy;
    private String customize;

    @TableField("Kit_Cost")
    private Integer kitCost;

    private String uses;

    @TableField("Stack_Size")
    private Integer stackSize;

    private Integer buy;
    private Integer sell;

    @TableField("Tool_Set")
    private String toolSet;

    @TableField("Miles_Price")
    private Integer milesPrice;

    private String source;

    @TableField("Source_Notes")
    private String sourceNotes;
}