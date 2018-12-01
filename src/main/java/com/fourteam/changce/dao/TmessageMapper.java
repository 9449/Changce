package com.fourteam.changce.dao;

import com.fourteam.changce.pojo.Tmessage;

public interface TmessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tmessage record);

    int insertSelective(Tmessage record);

    Tmessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tmessage record);

    int updateByPrimaryKeyWithBLOBs(Tmessage record);

    int updateByPrimaryKey(Tmessage record);
}