package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Tools;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ToolsMapper extends BaseMapper<Tools> {

    @Select("SELECT * FROM tools WHERE name = #{name}")
    List<Tools> findByName(@Param("name") String name);

    @Insert("INSERT INTO tools (name, variation, body_title, diy, customize, kit_cost, uses, stack_size, buy, sell, tool_set, miles_price, source, source_notes) " +
            "VALUES (#{name}, #{variation}, #{bodyTitle}, #{diy}, #{customize}, #{kitCost}, #{uses}, #{stackSize}, #{buy}, #{sell}, #{toolSet}, #{milesPrice}, #{source}, #{sourceNotes})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertTool(Tools tools);

    @Update("UPDATE tools SET name = #{name}, variation = #{variation}, body_title = #{bodyTitle}, diy = #{diy}, customize = #{customize}, kit_cost = #{kitCost}, " +
            "uses = #{uses}, stack_size = #{stackSize}, buy = #{buy}, sell = #{sell}, tool_set = #{toolSet}, miles_price = #{milesPrice}, source = #{source}, source_notes = #{sourceNotes} " +
            "WHERE id = #{id}")
    int updateTool(Tools tools);

    @Delete("DELETE FROM tools WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}
