package org.example.mapper;

import org.example.model.Statement;

public interface StatementMapper {
    int deleteByPrimaryKey(Long stmid);

    int insert(Statement record);

    int insertSelective(Statement record);

    Statement selectByPrimaryKey(Long stmid);

    int updateByPrimaryKeySelective(Statement record);

    int updateByPrimaryKey(Statement record);
}