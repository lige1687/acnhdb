package com.ecnudbcourse.acnhdb.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Recipes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecipesMapper extends BaseMapper<Recipes> {
    // 可以在这里添加自定义的 SQL 查询方法
}
