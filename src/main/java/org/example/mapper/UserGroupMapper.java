package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.model.UserGroup;

public interface UserGroupMapper {
    int deleteByPrimaryKey(@Param("userid") Integer userid, @Param("groupid") Short groupid);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(@Param("userid") Integer userid, @Param("groupid") Short groupid);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
}