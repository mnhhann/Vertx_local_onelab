package org.example.mapper;

import org.example.model.LabIndicator;

import java.util.List;

public interface LabIndicatorMapper {
    int deleteByPrimaryKey(Integer indid);

    int insert(LabIndicator record);

    int insertSelective(LabIndicator record);

    LabIndicator selectByPrimaryKey(Integer indid);

    int updateByPrimaryKeySelective(LabIndicator record);

    int updateByPrimaryKey(LabIndicator record);

    List<LabIndicator> getAllLabIndicators();
}