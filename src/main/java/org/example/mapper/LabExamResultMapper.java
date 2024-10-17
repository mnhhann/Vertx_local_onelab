package org.example.mapper;

import org.example.model.LabExamResult;

import java.util.List;

public interface LabExamResultMapper {
    int deleteByPrimaryKey(Long exrltid);

    int insert(LabExamResult record);

    int insertSelective(LabExamResult record);

    LabExamResult selectByPrimaryKey(Long exrltid);

    int updateByPrimaryKeySelective(LabExamResult record);

    int updateByPrimaryKey(LabExamResult record);

    List<LabExamResult> getAllLabExamResults();

}