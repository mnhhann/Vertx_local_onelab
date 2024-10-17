package org.example.mapper;

import org.example.model.MedProvider;

public interface MedProviderMapper {
    int deleteByPrimaryKey(Long medproviderid);

    int insert(MedProvider record);

    int insertSelective(MedProvider record);

    MedProvider selectByPrimaryKey(Long medproviderid);

    int updateByPrimaryKeySelective(MedProvider record);

    int updateByPrimaryKey(MedProvider record);
}