package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("music")
public class Music {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer buy;
    private Integer sell;
    private String color1;
    private String color2;
    private String size;
    private String source;
    private String sourceNotes;
    private String catalog;
}
