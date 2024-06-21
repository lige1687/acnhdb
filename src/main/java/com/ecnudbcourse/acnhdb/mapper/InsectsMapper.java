package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Insects;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface InsectsMapper extends BaseMapper<Insects> {

    @Select("SELECT * FROM insects WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Insects> findByName(@Param("name") String name);

    @Insert("INSERT INTO insects (Name, Sell, Where_How, Weather, Total_Catches_to_Unlock, Spawn_Rates, NH_Jan, NH_Feb, NH_Mar, NH_Apr, NH_May, NH_Jun, NH_Jul, NH_Aug, NH_Sep, NH_Oct, NH_Nov, NH_Dec, SH_Jan, SH_Feb, SH_Mar, SH_Apr, SH_May, SH_Jun, SH_Jul, SH_Aug, SH_Sep, SH_Oct, SH_Nov, SH_Dec, Color1, Color2) VALUES (#{name}, #{sell}, #{whereHow}, #{weather}, #{totalCatchesToUnlock}, #{spawnRates}, #{nhJan}, #{nhFeb}, #{nhMar}, #{nhApr}, #{nhMay}, #{nhJun}, #{nhJul}, #{nhAug}, #{nhSep}, #{nhOct}, #{nhNov}, #{nhDec}, #{shJan}, #{shFeb}, #{shMar}, #{shApr}, #{shMay}, #{shJun}, #{shJul}, #{shAug}, #{shSep}, #{shOct}, #{shNov}, #{shDec}, #{color1}, #{color2})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertInsects(Insects insects);

    @Update("UPDATE insects SET Name = #{name}, Sell = #{sell}, Where_How = #{whereHow}, Weather = #{weather}, Total_Catches_to_Unlock = #{totalCatchesToUnlock}, Spawn_Rates = #{spawnRates}, NH_Jan = #{nhJan}, NH_Feb = #{nhFeb}, NH_Mar = #{nhMar}, NH_Apr = #{nhApr}, NH_May = #{nhMay}, NH_Jun = #{nhJun}, NH_Jul = #{nhJul}, NH_Aug = #{nhAug}, NH_Sep = #{nhSep}, NH_Oct = #{nhOct}, NH_Nov = #{nhNov}, NH_Dec = #{nhDec}, SH_Jan = #{shJan}, SH_Feb = #{shFeb}, SH_Mar = #{shMar}, SH_Apr = #{shApr}, SH_May = #{shMay}, SH_Jun = #{shJun}, SH_Jul = #{shJul}, SH_Aug = #{shAug}, SH_Sep = #{shSep}, SH_Oct = #{shOct}, SH_Nov = #{shNov}, SH_Dec = #{shDec}, Color1 = #{color_1}, Color2 = #{color_2} WHERE id = #{id}")
    int updateInsects(Insects insects);

    @Delete("DELETE FROM insects WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

    @Select("SELECT * FROM insects WHERE ${month} LIKE CONCAT('%', #{time}, '%')")
    List<Insects> findActiveInsects(@Param("month") String month, @Param("time") String time);

    @Select("SELECT * FROM insects")
    List<Insects> findAllInsects();
}