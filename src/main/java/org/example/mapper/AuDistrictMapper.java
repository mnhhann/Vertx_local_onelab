package org.example.mapper;

import org.example.model.AuDistrict;

import java.util.List;

public interface AuDistrictMapper {
    int deleteByPrimaryKey(String code);

    int insert(AuDistrict record);

    int insertSelective(AuDistrict record);

    AuDistrict selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(AuDistrict record);

    int updateByPrimaryKey(AuDistrict record);

    List<AuDistrict> getAllAuDistricts();
}