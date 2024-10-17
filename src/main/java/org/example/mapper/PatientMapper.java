package org.example.mapper;

import org.example.model.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(Long patientid);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Long patientid);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}