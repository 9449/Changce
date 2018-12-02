package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.TmessageMapper;
import com.fourteam.changce.pojo.Tmessage;
import com.fourteam.changce.opp.service.TmessageService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TmessageServiceImpl implements TmessageService {
    @Autowired
    private TmessageMapper tmessageMapper;
    @Override
    public ResultBean addmessage(Tmessage tmessage) {
        if (tmessage.getUsername() == "" || tmessage.getEmail() == "" || tmessage.getMessage() == "") {
            return ResultUtil.setError(2000,"添加失败",null);
        } else {
            tmessageMapper.insert(tmessage);
            return ResultUtil.setOK("留言成功",null);
        }
    }
}
