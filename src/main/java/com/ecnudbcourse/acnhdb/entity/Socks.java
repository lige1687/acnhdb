package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("socks")
public class Socks {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;
    private Integer buy;
    private Integer sell;
    private String color_1;
    private String color_2;
    private Integer milesPrice;
    private String source;
    private String sourceNotes;
    private String seasonalAvailability;
    private String mannequinPiece;
    private String style;
    private String labelThemes;
    private String catalog;
}
