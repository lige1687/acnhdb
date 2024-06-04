package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("construction")
public class Construction {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer buy;
    private String category;
    private String source;
}
