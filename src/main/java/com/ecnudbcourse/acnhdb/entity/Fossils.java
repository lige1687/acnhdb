package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("fossils")
public class Fossils {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer sell;
    private String color1;
    private String color2;
    private String size;
    private String museum;
    private String interact;
}
