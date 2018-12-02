package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.ServerMapper;
import com.fourteam.changce.pojo.Server;
import com.fourteam.changce.opp.service.ServerService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerMapper serverMapper;
    @Override
    public ResultBean findservers() {
        List<Server> servers = serverMapper.findServers();
        return ResultUtil.setOK("OK",servers);
    }
}
