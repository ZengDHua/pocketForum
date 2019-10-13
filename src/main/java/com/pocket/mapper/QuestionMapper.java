package com.pocket.mapper;

import com.pocket.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther Akie
 * @date 2019/10/11 16:23
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,creator,tag,gmt_create,gmt_modified) values (#{title},#{description},#{creator},#{tag},#{gmtCreate},#{gmtModified})")
    void create(Question question);

    @Select("select * from question")
    List<Question> list();
}
