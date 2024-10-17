package org.example.mapper;

import org.example.model.Group;

import java.util.List;

public interface GroupMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);

    List<Group> getAllGroups();
}