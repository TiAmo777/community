package com.community.mapper;

import com.community.model.Question;
import com.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
   int incView(Question record);
}