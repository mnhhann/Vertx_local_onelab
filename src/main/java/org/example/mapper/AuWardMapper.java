package org.example.mapper;

import org.example.model.AuWard;

import java.util.List;

public interface AuWardMapper {
    int deleteByPrimaryKey(String code);

    int insert(AuWard record);

    int insertSelective(AuWard record);

    AuWard selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(AuWard record);

    int updateByPrimaryKey(AuWard record);

    List<AuWard> getAllAuWards();
}