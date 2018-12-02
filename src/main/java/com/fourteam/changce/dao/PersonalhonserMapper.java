package com.fourteam.changce.dao;

import com.fourteam.changce.pojo.Personalhonser;

import java.util.List;

public interface PersonalhonserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personalhonser record);

    int insertSelective(Personalhonser record);

    Personalhonser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personalhonser record);

    int updateByPrimaryKeyWithBLOBs(Personalhonser record);

    int updateByPrimaryKey(Personalhonser record);

    List<Personalhonser> findperhons(Integer aid);
}