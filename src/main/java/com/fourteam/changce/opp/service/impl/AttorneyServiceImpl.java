package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.AttorneyMapper;
import com.fourteam.changce.pojo.Attorney;
import com.fourteam.changce.opp.service.AttorneyService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttorneyServiceImpl implements AttorneyService {
    @Autowired
    private AttorneyMapper attorneyMapper;

    @Override
    public ResultBean findAll() {
        List<Attorney> data = attorneyMapper.findAll();

        return ResultUtil.setOK("OK",data);
    }

    @Override
    public ResultBean findAttById(Integer aid) {
        Attorney attorney = new Attorney();
        if (aid == -1) {
            Attorney attorney1 = attorneyMapper.selectOrder();
            attorney = attorney1;

        } else {
            attorney = attorneyMapper.selectByPrimaryKey(aid);
        }

        return ResultUtil.setOK("OK",attorney);
    }
}
