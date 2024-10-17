package org.example.mapper;

import org.example.model.Contract;

import java.util.List;

public interface ContractMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);

    List<Contract> getAllContracts();
}