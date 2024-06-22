package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.ParadisePlanning;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ParadisePlanningMapper extends BaseMapper<ParadisePlanning> {

    @Select("SELECT * FROM paradise_planning WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<ParadisePlanning> findByName(@Param("name") String name);

    @Insert("INSERT INTO paradise_planning (Name, Request, Thought_Bubble, Song, Furniture_Name_List) VALUES (#{name}, #{request}, #{thoughtBubble}, #{song}, #{furnitureNameList})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertParadisePlanning(ParadisePlanning paradise_planning);

    @Update("UPDATE paradise_planning SET Name = #{name}, Request = #{request}, Thought_Bubble = #{thoughtBubble}, Song = #{song}, Furniture_Name_List = #{furnitureNameList} WHERE id = #{id}")
    int updateParadisePlanning(ParadisePlanning paradise_planning);

    @Delete("DELETE FROM paradise_planning WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("SELECT * FROM paradise_planning WHERE Request LIKE CONCAT('%', #{request}, '%')")
    List<ParadisePlanning> findByRequest(@Param("request") String request);

    @Select("SELECT * FROM paradise_planning WHERE Thought_Bubble LIKE CONCAT('%', #{thoughtBubble}, '%')")
    List<ParadisePlanning> findByThoughtBubble(@Param("thoughtBubble") String thoughtBubble);

    @Select("SELECT * FROM paradise_planning WHERE Song LIKE CONCAT('%', #{song}, '%')")
    List<ParadisePlanning> findBySong(@Param("song") String song);

    @Select("SELECT * FROM paradise_planning WHERE Furniture_Name_List LIKE CONCAT('%', #{furnitureNameList}, '%')")
    List<ParadisePlanning> findByFurnitureNameList(@Param("furnitureNameList") String furnitureNameList);
}
