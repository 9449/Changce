package com.fourteam.changce.dao;

import com.fourteam.changce.pojo.Server;

public interface ServerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Server record);

    int insertSelective(Server record);

    Server selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Server record);

    int updateByPrimaryKeyWithBLOBs(Server record);

    int updateByPrimaryKey(Server record);
}