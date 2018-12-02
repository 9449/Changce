package com.fourteam.changce.dao;

import com.fourteam.changce.pojo.Attorney;

import java.util.List;

public interface AttorneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attorney record);

    int insertSelective(Attorney record);

    Attorney selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attorney record);

    int updateByPrimaryKeyWithBLOBs(Attorney record);

    int updateByPrimaryKey(Attorney record);

    List<Attorney> findAll();

    Attorney selectOrder();
}