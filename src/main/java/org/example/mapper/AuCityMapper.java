package org.example.mapper;

import org.example.model.AuCity;

import java.util.List;

public interface AuCityMapper {
    int deleteByPrimaryKey(String code);

    int insert(AuCity record);

    int insertSelective(AuCity record);

    AuCity selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(AuCity record);

    int updateByPrimaryKey(AuCity record);

    List<AuCity> getAllCities();
}