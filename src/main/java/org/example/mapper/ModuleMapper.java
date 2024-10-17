package org.example.mapper;

import org.example.model.Module;

public interface ModuleMapper {
    int deleteByPrimaryKey(Short moduleid);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Short moduleid);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}