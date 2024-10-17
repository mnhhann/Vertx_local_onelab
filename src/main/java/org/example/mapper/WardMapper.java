package org.example.mapper;

import org.example.model.Ward;

public interface WardMapper {
    int deleteByPrimaryKey(Short wardid);

    int insert(Ward record);

    int insertSelective(Ward record);

    Ward selectByPrimaryKey(Short wardid);

    int updateByPrimaryKeySelective(Ward record);

    int updateByPrimaryKey(Ward record);
}