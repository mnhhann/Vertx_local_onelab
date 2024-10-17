package org.example.mapper;

import org.example.model.LabExam;

import java.util.List;

public interface LabExamMapper {
    int deleteByPrimaryKey(Long labexid);

    int insert(LabExam record);

    int insertSelective(LabExam record);

    LabExam selectByPrimaryKey(Long labexid);

    int updateByPrimaryKeySelective(LabExam record);

    int updateByPrimaryKey(LabExam record);

    List<LabExam> getAllLabExams();
}