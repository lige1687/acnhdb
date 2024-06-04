package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("villagers")
public class Villagers {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String name;
    private String species;
    private String gender;
    private String personality;
    private String hobby;
    private String birthday;
    private String catchphrase;
    private String favoriteSong;
    private String style_1;
    private String style_2;
    private String color_1;
    private String color_2;
    private String wallpaper;
    private String flooring;
}
