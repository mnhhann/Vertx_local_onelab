package org.example.mapper;

import org.example.model.LabExamItem;

import java.util.List;

public interface LabExamItemMapper {
    int deleteByPrimaryKey(Long exitemid);

    int insert(LabExamItem record);

    int insertSelective(LabExamItem record);

    LabExamItem selectByPrimaryKey(Long exitemid);

    int updateByPrimaryKeySelective(LabExamItem record);

    int updateByPrimaryKey(LabExamItem record);

    List<LabExamItem> getAllLabExamItems();
}