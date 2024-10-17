package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.model.MasterData;

import java.util.List;

public interface MasterDataMapper {
    int deleteByPrimaryKey(@Param("type") Short type, @Param("code") Short code);

    int insert(MasterData record);

    int insertSelective(MasterData record);

    MasterData selectByPrimaryKey(@Param("type") Short type, @Param("code") Short code);

    int updateByPrimaryKeySelective(MasterData record);

    int updateByPrimaryKey(MasterData record);

    List<MasterData> getAllMasterDatas();
}