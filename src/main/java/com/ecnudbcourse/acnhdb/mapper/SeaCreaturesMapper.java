package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.SeaCreatures;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface SeaCreaturesMapper extends BaseMapper<SeaCreatures> {

    @Select("SELECT * FROM sea_creatures WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<SeaCreatures> findByName(@Param("name") String name);

    @Insert("INSERT INTO sea_creatures (Name, Sell, Shadow, Movement_Speed, Total_Catches_to_Unlock, Spawn_Rates, NH_Jan, NH_Feb, NH_Mar, NH_Apr, NH_May, NH_Jun, NH_Jul, NH_Aug, NH_Sep, NH_Oct, NH_Nov, NH_Dec, SH_Jan, SH_Feb, SH_Mar, SH_Apr, SH_May, SH_Jun, SH_Jul, SH_Aug, SH_Sep, SH_Oct, SH_Nov, SH_Dec, Surface, Lighting_Type) VALUES (#{name}, #{sell}, #{shadow}, #{movementSpeed}, #{totalCatchesToUnlock}, #{spawnRates}, #{nhJan}, #{nhFeb}, #{nhMar}, #{nhApr}, #{nhMay}, #{nhJun}, #{nhJul}, #{nhAug}, #{nhSep}, #{nhOct}, #{nhNov}, #{nhDec}, #{shJan}, #{shFeb}, #{shMar}, #{shApr}, #{shMay}, #{shJun}, #{shJul}, #{shAug}, #{shSep}, #{shOct}, #{shNov}, #{shDec}, #{surface}, #{lightingType})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertSeaCreatures(SeaCreatures sea_creatures);

    @Update("UPDATE sea_creatures SET Name = #{name}, Sell = #{sell}, Shadow = #{shadow}, Movement_Speed = #{movementSpeed}, Total_Catches_to_Unlock = #{totalCatchesToUnlock}, Spawn_Rates = #{spawnRates}, NH_Jan = #{nhJan}, NH_Feb = #{nhFeb}, NH_Mar = #{nhMar}, NH_Apr = #{nhApr}, NH_May = #{nhMay}, NH_Jun = #{nhJun}, NH_Jul = #{nhJul}, NH_Aug = #{nhAug}, NH_Sep = #{nhSep}, NH_Oct = #{nhOct}, NH_Nov = #{nhNov}, NH_Dec = #{nhDec}, SH_Jan = #{shJan}, SH_Feb = #{shFeb}, SH_Mar = #{shMar}, SH_Apr = #{shApr}, SH_May = #{shMay}, SH_Jun = #{shJun}, SH_Jul = #{shJul}, SH_Aug = #{shAug}, SH_Sep = #{shSep}, SH_Oct = #{shOct}, SH_Nov = #{shNov}, SH_Dec = #{shDec}, Surface = #{surface}, Lighting_Type = #{lightingType} WHERE id = #{id}")
    int updateSeaCreatures(SeaCreatures sea_creatures);

    @Delete("DELETE FROM sea_creatures WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM sea_creatures" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<SeaCreatures> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);
}
