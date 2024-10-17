package org.example.mapper;

import org.example.model.WardUnit;

public interface WardUnitMapper {
    int deleteByPrimaryKey(Short unitid);

    int insert(WardUnit record);

    int insertSelective(WardUnit record);

    WardUnit selectByPrimaryKey(Short unitid);

    int updateByPrimaryKeySelective(WardUnit record);

    int updateByPrimaryKey(WardUnit record);
}