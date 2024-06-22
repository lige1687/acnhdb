package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Construction;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ConstructionMapper extends BaseMapper<Construction> {

    @Select("SELECT * FROM construction WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Construction> findByName(@Param("name") String name);

    @Insert("INSERT INTO construction (Name, Buy, Category, Source) VALUES (#{name}, #{buy}, #{category}, #{source})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertConstruction(Construction construction);

    @Update("UPDATE construction SET Name = #{name}, Buy = #{buy}, Category = #{category}, Source = #{source} WHERE id = #{id}")
    int updateConstruction(Construction construction);

    @Delete("DELETE FROM construction WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM construction" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Construction> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM construction WHERE Category LIKE CONCAT('%', #{category}, '%')")
    List<Construction> findByCategory(@Param("category") String category);

    @Select("SELECT * FROM construction WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Construction> findBySource(@Param("source") String source);
}
