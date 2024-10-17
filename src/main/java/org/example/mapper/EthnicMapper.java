package org.example.mapper;

import org.example.model.Contract;
import org.example.model.Ethnic;

import java.util.List;

public interface EthnicMapper {
    int deleteByPrimaryKey(String code);

    int insert(Ethnic record);

    int insertSelective(Ethnic record);

    Ethnic selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Ethnic record);

    int updateByPrimaryKey(Ethnic record);

    List<Ethnic> getAllEthnics();
}