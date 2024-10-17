package org.example.mapper;

import org.example.model.ContractStaff;

import java.util.List;

public interface ContractStaffMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractStaff record);

    int insertSelective(ContractStaff record);

    ContractStaff selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractStaff record);

    int updateByPrimaryKey(ContractStaff record);

    List<ContractStaff> getAllContractStaffs();
}