package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("floors")
public class Floors {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String vfx;
    private String diy;
    private Integer buy;
    private Integer sell;
    private String color1;
    private String color2;
    private Integer milesPrice;
    private String source;
    private String hhaConcept1;
    private String hhaConcept2;
    private String hhaSeries;
    private String tag;
    private String catalog;
}
