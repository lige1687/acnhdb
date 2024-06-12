package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("music")public class Music {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer buy;
    private Integer sell;

    @TableField("Color_1")
    private String color_1;

    @TableField("Color_2")
    private String color_2;

    private String size;
    private String source;

    @TableField("Source_Notes")
    private String sourceNotes;

    private String catalog;
}