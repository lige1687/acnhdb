package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("paradise_planning")
public class ParadisePlanning {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String request;
    private String thoughtBubble;
    private String song;
    private String furnitureNameList;
}
