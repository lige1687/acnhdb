package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("photos")
public class Photos {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String variation;
    private String color1;
    private String color2;
}
