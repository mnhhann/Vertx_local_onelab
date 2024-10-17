package org.example.mapper;

import org.example.model.StmMedService;

public interface StmMedServiceMapper {
    int deleteByPrimaryKey(Integer stmmedid);

    int insert(StmMedService record);

    int insertSelective(StmMedService record);

    StmMedService selectByPrimaryKey(Integer stmmedid);

    int updateByPrimaryKeySelective(StmMedService record);

    int updateByPrimaryKey(StmMedService record);
}