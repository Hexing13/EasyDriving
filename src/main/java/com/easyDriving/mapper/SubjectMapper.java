package com.easyDriving.mapper;

import com.easyDriving.pojo.Subject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by hexing on 15-12-15.
 */
public interface SubjectMapper {
    //添加测试题
    @Insert("insert into subject(s_type,s_chapter,s_content,answer_a,answer_b,answer_c,answer_d,answer,s_analyze,s_image) values(#{s_type},#{s_chapter},#{s_content},#{answer_a},#{answer_b},#{answer_c},#{answer_d},#{answer},#{s_analyze},#{s_image})")
    public void addTest(Subject subject);

    //获得试题
    @Select("select *from ${s_type} limit ${id},1")
    public Subject getTest(@Param("s_type")String s_type,@Param("id")int id);

    //获得试题的总数
    @Select("select count(s_id) from ${s_type}")
    public int getTotalCount(@Param("s_type")String s_type);
}
