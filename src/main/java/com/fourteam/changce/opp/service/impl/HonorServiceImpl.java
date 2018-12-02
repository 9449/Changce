package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.HonorMapper;
import com.fourteam.changce.pojo.Honor;
import com.fourteam.changce.opp.service.HonorService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HonorServiceImpl implements HonorService {
    @Autowired
    private HonorMapper honorMapper;
    @Override
    public ResultBean findHonors() {
        List<Honor> list = honorMapper.findHonors();
        return ResultUtil.setOK("Ok",list);
    }
}
