package org.example.mapper;

import org.example.model.StaffGroup;

public interface StaffGroupMapper {
    int deleteByPrimaryKey(Integer staffgrpid);

    int insert(StaffGroup record);

    int insertSelective(StaffGroup record);

    StaffGroup selectByPrimaryKey(Integer staffgrpid);

    int updateByPrimaryKeySelective(StaffGroup record);

    int updateByPrimaryKey(StaffGroup record);
}