package org.example.mapper;

import org.example.model.Icd10;

import java.util.List;

public interface Icd10Mapper {
    int deleteByPrimaryKey(String code);

    int insert(Icd10 record);

    int insertSelective(Icd10 record);

    Icd10 selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Icd10 record);

    int updateByPrimaryKey(Icd10 record);

    List<Icd10> getAllICD10s();
}