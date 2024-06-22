package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Reactions;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ReactionsMapper extends BaseMapper<Reactions> {

    @Select("SELECT * FROM reactions WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Reactions> findByName(@Param("name") String name);

    @Insert("INSERT INTO reactions (Name, Source, Source_Notes) VALUES (#{name}, #{source}, #{sourceNotes})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertReactions(Reactions reactions);

    @Update("UPDATE reactions SET Name = #{name}, Source = #{source}, Source_Notes = #{sourceNotes} WHERE id = #{id}")
    int updateReactions(Reactions reactions);

    @Delete("DELETE FROM reactions WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("SELECT * FROM reactions WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Reactions> findBySource(@Param("source") String source);

    @Select("SELECT * FROM reactions WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Reactions> findBySourceNotes(@Param("sourceNotes") String sourceNotes);
}
