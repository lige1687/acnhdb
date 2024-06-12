package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Fencing;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FencingMapper extends BaseMapper<Fencing> {

    @Select("SELECT * FROM fencing WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Fencing> findByName(@Param("name") String name);

    @Insert("INSERT INTO fencing (Name, Sell, Source) VALUES (#{name}, #{sell}, #{source})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertFencing(Fencing fencing);

    @Update("UPDATE fencing SET Name = #{name}, Sell = #{sell}, Source = #{source} WHERE id = #{id}")
    int updateFencing(Fencing fencing);

    @Delete("DELETE FROM fencing WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
