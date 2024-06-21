package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("reactions")
public class Reactions {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String source;
    private String sourceNotes;
}
