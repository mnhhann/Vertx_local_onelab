package org.example.mapper;

import org.example.model.LabIndiMedService;

import java.util.List;

public interface LabIndiMedServiceMapper {
    int deleteByPrimaryKey(Long indmedid);

    int insert(LabIndiMedService record);

    int insertSelective(LabIndiMedService record);

    LabIndiMedService selectByPrimaryKey(Long indmedid);

    int updateByPrimaryKeySelective(LabIndiMedService record);

    int updateByPrimaryKey(LabIndiMedService record);

    List<LabIndiMedService> getAllLabIndiMedServices();
}