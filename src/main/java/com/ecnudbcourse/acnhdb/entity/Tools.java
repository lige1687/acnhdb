package com.ecnudbcourse.acnhdb.entity;



import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

@Data
@TableName("tools")
public class Tools {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    private String name;
    private String variation;
    private String bodyTitle;
    private String diy;
    private String customize;
    private Integer kitCost;
    private String uses;
    private Integer stackSize;
    private Integer buy;
    private Integer sell;
    private String toolSet;
    private Integer milesPrice;
    private String source;
    private String sourceNotes;
}
