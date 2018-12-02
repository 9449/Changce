package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.AttorneyMapper;
import com.fourteam.changce.dao.PersonalhonserMapper;
import com.fourteam.changce.pojo.Attorney;
import com.fourteam.changce.pojo.Personalhonser;
import com.fourteam.changce.opp.service.PersonalhonserService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalhonserServiceImpl implements PersonalhonserService {
    @Autowired
    private PersonalhonserMapper personalhonserMapper;
    @Autowired
    private AttorneyMapper attorneyMapper;
    @Override
    public ResultBean findperhons(Integer aid) {
        int id = 0;
        if (aid == -1) {
            Attorney attorney = attorneyMapper.selectOrder();
            id = attorney.getId();
        } else {
            id = aid;
        }
        List<Personalhonser> list = personalhonserMapper.findperhons(id);
        return ResultUtil.setOK("OK",list);
    }
}
