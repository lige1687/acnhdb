package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Housewares;
import org.apache.ibatis.annotations.*;
// 导入注解

import java.util.List;


@Mapper
//标记 是mapper , 即dao层的东西
// basemapper提供了基本的查询方法, 可以使用xml自定义一些复杂的查询
public interface HousewaresMapper extends BaseMapper<Housewares> {

    @Select("SELECT * FROM housewares WHERE name = #{name}")
    List<Housewares> findByName(@Param("name") String name);

    @Insert("INSERT INTO housewares (name, variation, body_title, pattern, pattern_title, diy, body_customize, pattern_customize, kit_cost, buy_price, sell_price, miles_price, color_1, color_2, size, interact, tag, outdoor, source, source_notes, hha_concept_1, hha_concept_2, hha_series, hha_set, speaker_type, lighting_type) VALUES (#{name}, #{variation}, #{bodyTitle}, #{pattern}, #{patternTitle}, #{diy}, #{bodyCustomize}, #{patternCustomize}, #{kitCost}, #{buyPrice}, #{sellPrice}, #{milesPrice}, #{color1}, #{color2}, #{size}, #{interact}, #{tag}, #{outdoor}, #{source}, #{sourceNotes}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{hhaSet}, #{speakerType}, #{lightingType})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertHouseWare(Housewares housewares);

    @Update("UPDATE housewares SET name = #{name}, variation = #{variation}, body_title = #{bodyTitle}, pattern = #{pattern}, pattern_title = #{patternTitle}, diy = #{diy}, body_customize = #{bodyCustomize}, pattern_customize = #{patternCustomize}, kit_cost = #{kitCost}, buy_price = #{buyPrice}, sell_price = #{sellPrice}, miles_price = #{milesPrice}, color_1 = #{color1}, color_2 = #{color2}, size = #{size}, interact = #{interact}, tag = #{tag}, outdoor = #{outdoor}, source = #{source}, source_notes = #{sourceNotes}, hha_concept_1 = #{hhaConcept1}, hha_concept_2 = #{hhaConcept2}, hha_series = #{hhaSeries}, hha_set = #{hhaSet}, speaker_type = #{speakerType}, lighting_type = #{lightingType} WHERE id = #{id}")
    int updateHouseWare(Housewares housewares);

    @Delete("DELETE FROM housewares WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}