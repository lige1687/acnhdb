package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("fencing")
public class Fencing {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer sell;
    private String source;
}
