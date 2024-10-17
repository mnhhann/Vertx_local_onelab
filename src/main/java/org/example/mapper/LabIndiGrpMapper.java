package org.example.mapper;

import org.example.model.LabIndiGrp;

import java.util.List;

public interface LabIndiGrpMapper {
    int deleteByPrimaryKey(String code);

    int insert(LabIndiGrp record);

    int insertSelective(LabIndiGrp record);

    LabIndiGrp selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(LabIndiGrp record);

    int updateByPrimaryKey(LabIndiGrp record);

    List<LabIndiGrp> getAllLabIndiGrps();
}