package org.example.mapper;

import org.example.model.MedService;

public interface MedServiceMapper {
    int deleteByPrimaryKey(Integer medserviceid);

    int insert(MedService record);

    int insertSelective(MedService record);

    MedService selectByPrimaryKey(Integer medserviceid);

    int updateByPrimaryKeySelective(MedService record);

    int updateByPrimaryKey(MedService record);
}