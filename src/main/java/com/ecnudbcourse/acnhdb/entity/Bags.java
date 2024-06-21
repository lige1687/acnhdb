package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("bags")
public class Bags {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;
    private String diy;
    private Integer buy;
    private Integer sell;
    private String color1;
    private String color2;
    private Integer milesPrice;
    private String source;
    private String style;
    private String labelThemes;
    private String catalog;
}
