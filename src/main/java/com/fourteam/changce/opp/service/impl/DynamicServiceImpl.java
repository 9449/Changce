package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.DynamicMapper;
import com.fourteam.changce.pojo.Dynamic;
import com.fourteam.changce.opp.service.DynamicService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DynamicServiceImpl implements DynamicService {
    @Autowired
    private DynamicMapper dynamicMapper;
    @Override
    public ResultBean findDynamics() {
        List<Dynamic> list = dynamicMapper.findDynamics();
        return ResultUtil.setOK("OK",list);
    }
}
