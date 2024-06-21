package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("art")
public class Art {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String genuine;
    private String category;
    private Integer buy;
    private Integer sell;
    private String size;
    private String realArtworkTitle;
    private String artist;
    private String museumDescription;
    private String hhaConcept1;
    private String hhaConcept2;
    private String tag;
}
