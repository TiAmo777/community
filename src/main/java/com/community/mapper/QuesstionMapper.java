package com.community.mapper;

import com.community.model.Quesstion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuesstionMapper {
    @Insert("insert into (title,description,gmt_crate,gmt_modified,creator,tag) values (#{titile},#{description},#{gmtCreate},#{gmtModified})")
    void create(Quesstion quesstion);
}
