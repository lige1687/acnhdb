package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Tool;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ToolMapper extends BaseMapper<Tool> {

    @Select("SELECT * FROM tools WHERE name = #{name}")
    List<Tool> findByName(@Param("name") String name);

    @Insert("INSERT INTO tools (name, variation, body_title, diy, customize, kit_cost, uses, stack_size, buy, sell, set, miles_price, source, source_notes) " +
            "VALUES (#{name}, #{variation}, #{bodyTitle}, #{diy}, #{customize}, #{kitCost}, #{uses}, #{stackSize}, #{buy}, #{sell}, #{set}, #{milesPrice}, #{source}, #{sourceNotes})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertTool(Tool tool);

    @Update("UPDATE tools SET name = #{name}, variation = #{variation}, body_title = #{bodyTitle}, diy = #{diy}, customize = #{customize}, kit_cost = #{kitCost}, " +
            "uses = #{uses}, stack_size = #{stackSize}, buy = #{buy}, sell = #{sell}, set = #{set}, miles_price = #{milesPrice}, source = #{source}, source_notes = #{sourceNotes} " +
            "WHERE id = #{id}")
    int updateTool(Tool tool);

    @Delete("DELETE FROM tools WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}
