package org.example.mapper;

import org.example.model.Zone;

public interface ZoneMapper {
    int deleteByPrimaryKey(Short code);

    int insert(Zone record);

    int insertSelective(Zone record);

    Zone selectByPrimaryKey(Short code);

    int updateByPrimaryKeySelective(Zone record);

    int updateByPrimaryKey(Zone record);
}