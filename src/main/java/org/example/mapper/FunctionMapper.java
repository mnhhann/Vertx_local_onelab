package org.example.mapper;

import org.example.model.Function;

import java.util.List;

public interface FunctionMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    List<Function> getAllFunctions();
}