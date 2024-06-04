package com.ecnudbcourse.acnhdb.entity;



import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

@Data
@TableName("tools")
public class Tool {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    private String name;
    private String variation;
    private String bodyTitle;
    private Boolean diy;
    private Boolean customize;
    private Integer kitCost;
    private Integer uses;
    private Integer stackSize;
    private Integer buy;
    private Integer sell;
    private String set;
    private Integer milesPrice;
    private String source;
    private String sourceNotes;
}
