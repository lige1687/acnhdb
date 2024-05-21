package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.HouseWare;
import org.apache.ibatis.annotations.*;
// 导入注解
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecnudbcourse.acnhdb.entity.HouseWare;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
//标记 是mapper , 即dao层的东西
// basemapper提供了基本的查询方法, 可以使用xml自定义一些复杂的查询
public interface HouseWareMapper extends BaseMapper<HouseWare> {

    @Select("SELECT * FROM HouseWare WHERE name = #{name}")
    List<HouseWare> findByName(@Param("name") String name);

    @Insert("INSERT INTO HouseWare (name, variation, body_title, pattern, pattern_title, diy, body_customize, pattern_customize, kit_cost, buy_price, sell_price, miles_price, color1, color2, size, interact, tag, outdoor, source, source_notes, hha_concept1, hha_concept2, hha_series, hha_set, speaker_type, lighting_type) VALUES (#{name}, #{variation}, #{bodyTitle}, #{pattern}, #{patternTitle}, #{diy}, #{bodyCustomize}, #{patternCustomize}, #{kitCost}, #{buyPrice}, #{sellPrice}, #{milesPrice}, #{color1}, #{color2}, #{size}, #{interact}, #{tag}, #{outdoor}, #{source}, #{sourceNotes}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{hhaSet}, #{speakerType}, #{lightingType})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertHouseWare(HouseWare houseWare);

    @Update("UPDATE HouseWare SET name = #{name}, variation = #{variation}, body_title = #{bodyTitle}, pattern = #{pattern}, pattern_title = #{patternTitle}, diy = #{diy}, body_customize = #{bodyCustomize}, pattern_customize = #{patternCustomize}, kit_cost = #{kitCost}, buy_price = #{buyPrice}, sell_price = #{sellPrice}, miles_price = #{milesPrice}, color1 = #{color1}, color2 = #{color2}, size = #{size}, interact = #{interact}, tag = #{tag}, outdoor = #{outdoor}, source = #{source}, source_notes = #{sourceNotes}, hha_concept1 = #{hhaConcept1}, hha_concept2 = #{hhaConcept2}, hha_series = #{hhaSeries}, hha_set = #{hhaSet}, speaker_type = #{speakerType}, lighting_type = #{lightingType} WHERE id = #{id}")
    int updateHouseWare(HouseWare houseWare);

    @Delete("DELETE FROM HouseWare WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}