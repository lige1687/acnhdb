package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("posters")
public class Posters {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String color_1;
    private String color_2;
    private String sourceNotes;
}
