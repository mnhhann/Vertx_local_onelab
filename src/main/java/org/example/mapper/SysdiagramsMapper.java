package org.example.mapper;

import org.example.model.Sysdiagrams;

public interface SysdiagramsMapper {
    int deleteByPrimaryKey(Integer diagramId);

    int insert(Sysdiagrams record);

    int insertSelective(Sysdiagrams record);

    Sysdiagrams selectByPrimaryKey(Integer diagramId);

    int updateByPrimaryKeySelective(Sysdiagrams record);

    int updateByPrimaryKey(Sysdiagrams record);
}