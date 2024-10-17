package org.example.mapper;

import org.example.model.AuCountry;

import java.util.List;

public interface AuCountryMapper {
    int deleteByPrimaryKey(String code);

    int insert(AuCountry record);

    int insertSelective(AuCountry record);

    AuCountry selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(AuCountry record);

    int updateByPrimaryKey(AuCountry record);

    List<AuCountry> getAllAuCountries();
}