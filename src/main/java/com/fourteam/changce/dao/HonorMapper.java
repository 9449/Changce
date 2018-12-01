package com.fourteam.changce.dao;

import com.fourteam.changce.pojo.Honor;

public interface HonorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Honor record);

    int insertSelective(Honor record);

    Honor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Honor record);

    int updateByPrimaryKeyWithBLOBs(Honor record);

    int updateByPrimaryKey(Honor record);
}